package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        System.out.println("Írj le összetett mondatot!");
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        Scanner scanWords = new Scanner(sentence);
        while (scanWords.hasNext()) {
            System.out.println(scanWords.next());
        }

        System.out.println("Írj még egy összetett mondatot!");
        sentence = scanner.nextLine();

        scanWords = new Scanner(sentence).useDelimiter(", ");
        while (scanWords.hasNext()) {
            System.out.println(scanWords.next());
        }
    }
}
