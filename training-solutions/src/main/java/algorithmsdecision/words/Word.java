package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String comparedWord) {
        boolean result = false;
        for (String word : words) {
            if (word.length() > comparedWord.length()){
                result = true;
            }
        }
        return result;
    }
}
