package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    TwoLetters twoLetters = new TwoLetters();

    @Test
    void testGetFirstTwoLetters() {
        List<String> words = Arrays.asList("dog", "cat", "auto", "1234");
        List<String> result = twoLetters.getFirstTwoLetters(words);
        assertEquals(result, Arrays.asList("do", "ca", "au", "12"));
    }
}