package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("java");
        words.addWord("dog");
        words.addWord("cat");
        words.addWord("jammed");
        words.addWord("automatic");
        words.addWord("boy");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> result = Arrays.asList("java", "jammed");
        words.getWordsStartWith("ja");
        assertEquals(result, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> result = Arrays.asList("dog", "cat", "boy");
        words.getWordsWithLength(3);
        assertEquals(result, words.getWords());
    }
}
