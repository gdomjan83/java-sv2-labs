package covid;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.nio.file.Paths;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class VaccinationDaoTest {

    private VaccinationDao vaccinationDao;

    @BeforeEach
    void init() {
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid_db?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root456");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect to database.", sqle);
        }

        vaccinationDao = new VaccinationDao(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).locations("db/migration/covid").load();
        flyway.clean();
        flyway.migrate();
    }

    @Test
    void testReadZipFileToDatabase() {
     //   vaccinationDao.copyZipFileToDatabase(Paths.get("src/test/resources/iranyitoszamok-varosok-2021.csv"));
        String cityFound = vaccinationDao.findCityByZipCode(8999);
        assertEquals("Zalalövő", cityFound);
        cityFound = vaccinationDao.findCityByZipCode(8200);
        assertEquals("Veszprém", cityFound);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> vaccinationDao.findCityByZipCode(111111));
        assertEquals("Zip code does not exist.", iae.getMessage());
    }

    @Test
    void testInsertCitizen() {
        Citizen citizen = new Citizen("Domján Gábor", "8999", 20, "gdomj@gmail.com", "039446574");
        vaccinationDao.insertCitizen(citizen);
        Citizen citizenFromDb = vaccinationDao.findCitizenbySsn("039446574");
        assertEquals("Domján Gábor", citizenFromDb.getFullName());
    }

}