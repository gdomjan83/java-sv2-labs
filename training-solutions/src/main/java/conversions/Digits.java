package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> digits = new ArrayList<>();

    public List<Integer> getDigits() {
        return digits;
    }

    public void addDigitsToList(String text) {
        for (char c: text.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(Integer.parseInt(String.valueOf(c)));
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();

        digits.addDigitsToList("Aut0m4tiku5");
        System.out.println(digits.getDigits());
    }
}
