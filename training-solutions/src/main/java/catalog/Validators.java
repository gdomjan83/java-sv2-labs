package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String input) {
        if (input == null || input.isBlank()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List input) {
        if (input == null || input.size() == 0) {
            return true;
        }
        return false;
    }
}
