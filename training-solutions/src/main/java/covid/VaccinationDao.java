package covid;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
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
        //language=sql
        List<String> result = jdbcTemplate.query("select city from cities where zip = ?", (rs, i) -> rs.getString("city"), zipCode);
        if (result.size() > 0) {
            return result.get(0);
        } else {
            throw new IllegalArgumentException("Zip code does not exist.");
        }
    }

    public void insertCitizen(Citizen citizen) {
        //language=sql
        jdbcTemplate.update(
                "insert into citizens (citizen_name, zip, age, email, taj, number_of_vaccination) values (?, ?, ?, ?, ?, ?)",
                citizen.getFullName(), citizen.getZipCode(), citizen.getAge(), citizen.getEmailAddress(), citizen.getSsn(), citizen.getNumberOfVaccination());
    }

    public Citizen findCitizenbySsn(String Ssn) {
        //language=sql
        return jdbcTemplate.queryForObject("select * from citizens where taj = ?",
                (rs, i) -> new Citizen(rs.getString("citizen_name"), rs.getString("zip"),
                        rs.getInt("age"), rs.getString("email"), rs.getString("taj")), Ssn);
    }

    public void insertCitizensFromCsv(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                insertCitizen(createCitizenFromLine(line));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file.", ioe);
        }
    }

    public void generateVaccinationListToFileByZipCode(Path path, int numberOfPeopleToVaccinate, String zipCode) {
        List<String> lines = new ArrayList<>();
        List<Citizen> citizens = generateCitizensFromDatabaseByZipCode(zipCode);
        int maxVaccination = Math.min(numberOfPeopleToVaccinate, citizens.size());
        LocalTime startTime = LocalTime.of(8, 0);
        for (int i = 0; i < maxVaccination; i++) {
            lines.add(String.join(";", getStringDataFromCitizen(citizens.get(i), startTime)));
            startTime = startTime.plusMinutes(30);
        }
        writeFile(path, lines);
    }

    private void writeFile(Path path, List<String> input) {
        try {
            Files.write(path, input);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not write to file.", ioe);
        }
    }

    private String[] getStringDataFromCitizen(Citizen citizen, LocalTime startTime) {
        String[] data = new String[6];
        data[0] = String.valueOf(startTime);
        data[1] = citizen.getFullName();
        data[2] = citizen.getZipCode();
        data[3] = String.valueOf(citizen.getAge());
        data[4] = citizen.getEmailAddress();
        data[5] = citizen.getSsn();
        return data;
    }

    private List<Citizen> generateCitizensFromDatabaseByZipCode(String zipCode) {
        //language=sql
        return jdbcTemplate.query("SELECT * FROM citizens where zip = ? and (number_of_vaccination = 0 or last_vaccination < (CURRENT_DATE - INTERVAL 15 DAY)) ORDER BY age DESC, citizen_name",
                (rs, i) -> new Citizen(rs.getString("citizen_name"), rs.getString("zip"),
                        rs.getInt("age"), rs.getString("email"), rs.getString("taj")), zipCode);
    }

    private void validateData(String name, String zipCode, int age, String email, String ssn) {
        Citizen.validateName(name);
        Citizen.validateZipCode(zipCode);
        Citizen.validateAge(age);
        Citizen.validateEmail(email);
        Citizen.validateSocialSecurityNumber(ssn);
    }

    private Citizen createCitizenFromLine(String input) {
        String[] data = input.split(";");
        String name = data[0];
        String zipCode = data[1];
        int age = Integer.parseInt(data[2]);
        String email = data[3];
        String ssn = data[4];
        validateData(name, zipCode, age, email, ssn);
        return new Citizen(name, zipCode, age, email, ssn);
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
