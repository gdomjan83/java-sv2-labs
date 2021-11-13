package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Automatic", "Car", "Film");

        try {
            for (int i = 0; i <= words.size(); i++) {
                System.out.println(words.get(i).charAt(0));
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
