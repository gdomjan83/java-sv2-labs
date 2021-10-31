package stringbasic.characters;

import java.util.Scanner;

public class Words {
    private String wordToSpell;

    public Words(String wordToSpell) {
        this.wordToSpell = wordToSpell;
    }

    public String getWordToSpell() {
        return wordToSpell;
    }

    public char[] askForInput(int letterNumber, Scanner scanner) {
        char[] letters = new char[letterNumber];
        for (int i = 0; i < letterNumber; i++) {
            char letter = scanner.nextLine().charAt(0);
            letters[i] = letter;
        }
        return letters;
    }

    public boolean compareWords(String wordToSpell, char[] letters) {
        String wordInput = new String(letters);
        return wordInput.equals(wordToSpell);
    }
}
