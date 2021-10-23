package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ",
                "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");

        for (String item: words) {
            if (item.length() == 6) {
                System.out.println(item);
            }
        }
    }
}
