package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A név nem lehet üres.");
        }
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("A születési év nem lehet 1900-nál kisebb.");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        SsnValidator validator = new SsnValidator();
        Patient patient = new Patient("Gabi", validator.validate("139446574"), 1990);

    }
}
