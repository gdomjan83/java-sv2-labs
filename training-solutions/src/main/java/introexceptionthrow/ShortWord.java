package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg egy legfeljebb öt betűs szót!");
        String word = sc.nextLine();

        for (Character letter : word.toCharArray()) {
            if ('0' <= letter && letter <= '9') {
                throw new IllegalArgumentException("Hiba. A szó számokat is tartalmaz!");
            } else if (word.length() > 5) {
                throw new IllegalArgumentException("Hiba. A szó hosszabb 5 betűnél!");
            }
        }
        System.out.println("A megadott szó: " + word);
    }
}
