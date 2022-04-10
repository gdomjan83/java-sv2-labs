package covid;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Citizen {
    private String fullName;
    private String zipCode;
    private int age;
    private String emailAddress;
    private String ssn;
    private int numberOfVaccination;
    private LocalDateTime lastVaccination;
    private static final String EMAIL_REGEX = "^([a-zA-Z0-9)]+)@([a-z]+)\\.([a-z]+)$";

    public Citizen(String fullName, String zipCode, int age, String emailAddress, String ssn) {
        this.fullName = fullName;
        this.zipCode = zipCode;
        this.age = age;
        this.emailAddress = emailAddress;
        this.ssn = ssn;
    }

    public int getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDateTime getLastVaccination() {
        return lastVaccination;
    }

    public String getFullName() {
        return fullName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSsn() {
        return ssn;
    }

    public static void validateName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name can not be empty.");
        }
    }

    public static void  validateZipCode(String zipCode) {
        if (zipCode.isBlank()) {
            throw new IllegalArgumentException("Zip code can not be empty.");
        }
    }

    public static void  validateAge(int age) {
        if (age <= 10) {
            throw new IllegalArgumentException("Must be older than 10 years take vaccination.");
        }
        if (age >= 150) {
            throw new IllegalArgumentException("Invalid age. (Must be less than 150 years.");
        }
    }

    public static void validateEmail(String emailAddress) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(emailAddress);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }

    public static void validateSocialSecurityNumber(String ssn) {
        int sum = getSumForValidation(ssn);
        int lastDigit = Integer.parseInt(String.valueOf(ssn.toCharArray()[8]));
        if (sum % 10 != lastDigit) {
            throw new IllegalArgumentException("Social Security Number is incorrect.");
        }
    }

    private static int getSumForValidation(String ssn) {
        int sum = 0;
        for (int i = 0; i < ssn.length() - 1; i++) {
            int actual= Integer.parseInt(String.valueOf(ssn.toCharArray()[i]));
            if (i % 2 == 0) {
                sum += actual * 3;
            } else {
                sum += actual * 7;
            }
        }
        return sum;
    }
}
