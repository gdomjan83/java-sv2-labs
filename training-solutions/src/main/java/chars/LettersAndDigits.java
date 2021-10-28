package chars;

public class LettersAndDigits {
    public void printLetterOrDigit(String text) {
        for (char c: text.toCharArray()) {
            if ('0' <= c && c <= '9'){
                System.out.println(c + ": szám");
            } else if ('a' <= Character.toLowerCase(c) && Character.toLowerCase(c) <= 'z') {
                System.out.println(c + ": betű");
            } else {
                System.out.println(c + ": egyéb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("Eicvn333X;j3i");
    }
}
