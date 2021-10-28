package chars;

public class Words {
    public String pushWord(String word) {
        char[] newWord = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            newWord[i] = (char) (word.toCharArray()[i] + 1);
        }

        String result = new String(newWord);
        return result;
    }

    public static void main(String[] args) {
        Words words = new Words();
        System.out.println(words.pushWord("baba"));
    }
}
