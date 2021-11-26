package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    Vowels vowels = new Vowels();

    @Test
    void testVowels() {
        String word = "auto";
        assertEquals(3, vowels.getNumberOfVowels(word));
    }

}