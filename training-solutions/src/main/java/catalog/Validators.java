package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Input can not be null or blank!");
        }
        return false;
    }

    public static boolean isEmpty(List input) {
        if (input == null || input.size() == 0) {
            throw new IllegalArgumentException("Input list can not be null or empty!");
        }
        return false;
    }
}
