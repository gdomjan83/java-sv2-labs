package covid;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class VaccinationDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public VaccinationDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void copyZipFileToDatabase(Path path) {
        String line;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                insertCities(line);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file.", ioe);
        }
    }
    
    public String findCityByZipCode(int zipCode) {
        List<String> result = jdbcTemplate.query("select city from cities where zip = ?", (rs, i) -> rs.getString("city"), zipCode);
        if (result.size() > 0) {
            return result.get(0);
        } else {
            throw new IllegalArgumentException("Zip code does not exist.");
        }
    }

    public void insertCitizen(Citizen citizen) {

    }


    private void insertCities(String line) {
        String[] data = line.split(";");
        int zipCode = Integer.parseInt(data[0]);
        String cityName;
        if (data.length == 2 || data[2].isBlank()) {
            cityName = data[1];
        } else {
            cityName = data[1] + "-" + data[2];
        }
        //language=sql
        jdbcTemplate.update("insert into cities (zip, city) values (?,?)", zipCode, cityName);
    }
}
