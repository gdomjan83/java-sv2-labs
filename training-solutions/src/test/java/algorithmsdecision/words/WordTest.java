package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void testWords() {
        Word word = new Word();

        boolean result = word.containsLongerWord(Arrays.asList("kutya", "macska", "dob", "automata"), "igaz");
        assertTrue(result);
        boolean result2 = word.containsLongerWord(Arrays.asList("kutya", "macska", "dob", "nem"), "produktív");
        assertFalse(result2);
    }
}