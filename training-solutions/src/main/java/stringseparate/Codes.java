package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder result = new StringBuilder("Betűvel kezdődő kódok: ");
        for (int i = 0; i < codes.size(); i++) {
            if (Character.isAlphabetic(codes.get(i).charAt(0))) {
                result.append(codes.get(i));
                if (i < codes.size() -1) {
                    result.append(", ");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();

        System.out.println(codes.getCodesStartWithLetter(
                new ArrayList<String>(Arrays.asList("t2484", "R423323", "34343ka", "b33", "9383kein", "ak3i"))
        ));
    }
}
