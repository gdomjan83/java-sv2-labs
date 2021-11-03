package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word){
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> remove = new ArrayList<>();
        for (String actual : words) {
            if (!actual.startsWith(prefix)) {
                remove.add(actual);
            }
        }
        words.removeAll(remove);
    }

    public void getWordsWithLength(int length) {
        List<String> remove = new ArrayList<>();
        for (String actual : words) {
            if (actual.length() != length) {
                remove.add(actual);
            }
        }
        words.removeAll(remove);
    }
}
