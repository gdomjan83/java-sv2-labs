package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nem adott meg nevet.");
        }
    }

    public void validateAge(String age) {
        if (age == null || age.isBlank()) {
            throw new IllegalArgumentException("Nem adott meg életkort.");
        }
        for (Character digit : age.toCharArray()) {
            if (!Character.isDigit(digit)) {
                throw new IllegalArgumentException("A megadott érték nem szám, vagy negatív szám. Hibás formátum.");
            }
        }
        if (Integer.parseInt(age) > 120) {
            throw new IllegalArgumentException("Az életkora 120-nál nagyobb. Ön már valószínűleg egy hulla.");
        }
    }
}
