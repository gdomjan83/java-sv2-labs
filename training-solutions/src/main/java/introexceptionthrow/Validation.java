package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Nem adott meg nevet.");
        }
    }

    public void validateAge(String age) {
        if (age == null || "".equals(age)) {
            throw new IllegalArgumentException("Nem adott meg életkort.");
        }
        for (Character digit : age.toCharArray()) {
            if (!Character.isDigit(digit)) {
                throw new IllegalArgumentException("Nem számot adott meg.");
            }
        }
        if (Integer.parseInt(age) <= 0 || Integer.parseInt(age) > 120) {
            throw new IllegalArgumentException("Az életkora nem 0 és 120 közé esik. Ön vagy meg sem született, vagy már valószínűleg egy hulla.");
        }
    }
}
