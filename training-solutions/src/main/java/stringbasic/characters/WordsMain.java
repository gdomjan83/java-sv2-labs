package stringbasic.characters;

import java.util.Scanner;

public class WordsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Melyik szót betűzzük?");
        String wordToSpell = sc.nextLine();

        Words words = new Words(wordToSpell);

        System.out.println("Betűzd a \"" + words.getWordToSpell() + "\" szót. A betűket Enter leütésével válaszd el egymástól.");
        char[] letters = words.askForInput(wordToSpell.length(), sc);

        System.out.println("A beírt betűk:");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        System.out.println();

        System.out.println(words.compareWords(wordToSpell, letters) ? "Helyesen betűzted a szót." : "Sajnos tévesen betűzted a szót.");

    }
}
