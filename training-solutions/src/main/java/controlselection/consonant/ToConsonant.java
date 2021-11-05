package controlselection.consonant;

public class ToConsonant {

    private String vowels = "aeiou";

    public char getConsonant(char letter) {
        char result = Character.toLowerCase(letter);
        if (vowels.contains(String.valueOf(result))) {
            return (char) ((int) result + 1);
        } else {
            return result;
        }
    }
}
