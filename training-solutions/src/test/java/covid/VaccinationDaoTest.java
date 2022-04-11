package covid;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.mariadb.jdbc.MariaDbDataSource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

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
        vaccinationDao.copyZipFileToDatabase(Paths.get("src/test/resources/iranyitoszamok-varosok-2021.csv"));
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

    @Test
    void testInsertCitizensFromCsv() {
        Path path = Paths.get("src/test/resources/registrationList.csv");
        vaccinationDao.insertCitizensFromCsv(path);
        Citizen citizen = vaccinationDao.findCitizenbySsn("900483842");
        assertEquals("bodnar@citromail.hu", citizen.getEmailAddress());
        citizen = vaccinationDao.findCitizenbySsn("457133452");
        assertEquals("2049", citizen.getZipCode());
    }

    @Test
    void testInsertCitizensFromCsvWrong() {
        Path path = Paths.get("src/test/resources/registrationListWrong.csv");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> vaccinationDao.insertCitizensFromCsv(path));
        assertEquals("Invalid email address.", iae.getMessage());
    }

    @TempDir
    File TempFolder;

    @Test
    void testGenerateVaccinationList() throws IOException {
        vaccinationDao.insertCitizensFromCsv(Paths.get("src/test/resources/registrationList.csv"));
        Path path = TempFolder.toPath().resolve("vaccinationList.csv");
        vaccinationDao.generateVaccinationListToFileByZipCode(path, 16, "8200");
        List<String> lines = Files.readAllLines(path);
        assertEquals("08:30;Domján Gábor;8200;38;gdomj@gmail.com;039446574", lines.get(1));
    }
}