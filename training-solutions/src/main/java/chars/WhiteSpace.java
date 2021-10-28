package chars;

public class WhiteSpace {
    public String makeWhitespaceToStar(String text) {

        char[] newText = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (text.toCharArray()[i] == ' ') {
                newText[i] = '*';
            } else {
                newText[i] = text.toCharArray()[i];
            }
        }
        String result = new String(newText);
        return result;
    }

    public static void main(String[] args) {
        WhiteSpace whiteSpace = new WhiteSpace();

        System.out.println(whiteSpace.makeWhitespaceToStar("Ez egy teszt szöveg."));
    }
}
