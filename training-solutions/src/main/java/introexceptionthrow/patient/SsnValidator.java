package introexceptionthrow.patient;

public class SsnValidator {
    public String validate(String ssn) {
        int sum = 0;
        if (ssn.length() != 9) {
            throw new IllegalArgumentException("A TAJ szám kilenc karakterből állhat. Hibás bevitel.");
        }

        for (int i = 0; i < ssn.length() - 1; i++) {
            if (!Character.isDigit(ssn.charAt(i))) {
                throw new IllegalArgumentException("A TAJ szám csak számokat tartalmazhat!");
            }
            if (i % 2 == 0) {
                sum += Character.getNumericValue(ssn.charAt(i)) * 3;
            } else {
                sum += Character.getNumericValue(ssn.charAt(i)) * 7;
            }
        }
        if (sum % 10 != Character.getNumericValue(ssn.charAt(ssn.length() - 1))) {
            throw new IllegalArgumentException("Érvénytelen TAJ szám.");
        }
        return ssn;
    }
}
