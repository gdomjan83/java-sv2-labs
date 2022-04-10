package covid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CitizenTest {

    @Test
    void validateCorrectCitizen() {
        Citizen citizen = new Citizen("DG", "8999", 20, "gdomj@gmail.com", "039446574");
        assertEquals("DG", citizen.getFullName());
    }

    @Test
    void validateEmptyName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateName("  "));
        assertEquals("Name can not be empty.", iae.getMessage());
    }

    @Test
    void validateZipCode() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateZipCode(""));
        assertEquals("Zip code can not be empty.", iae.getMessage());
    }

    @Test
    void validateAgeTooYoung() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateAge(10));
        assertEquals("Must be older than 10 years take vaccination.", iae.getMessage());
    }

    @Test
    void validateAgeTooOld() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateAge(150));
        assertEquals("Invalid age. (Must be less than 150 years.", iae.getMessage());

    }

    @Test
    void validateWrongEmail() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateEmail("gdomjgmail.com"));
        assertEquals("Invalid email address.", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateEmail("gdomj@gmail"));
        assertEquals("Invalid email address.", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateEmail("@gmail.co"));
        assertEquals("Invalid email address.", iae.getMessage());
    }

    @Test
    void validateWrongSsn() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> Citizen.validateSocialSecurityNumber("039446578"));
        assertEquals("Social Security Number is incorrect.", iae.getMessage());
    }
}