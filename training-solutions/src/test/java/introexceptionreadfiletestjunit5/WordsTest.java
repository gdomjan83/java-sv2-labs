package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {
    Words words = new Words();

    @Test
    public void testCorrectFile() {
        assertEquals("Anna", words.getFirstWordWithA(Paths.get("src/test/resources/words.txt")));
    }

    @Test
    public void testWrongFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(Paths.get("src/test/resources/wo344rds.txt")));
        assertEquals("File not found", ise.getMessage());
    }

    @Test
    public void testCorrectFile2() {
        assertEquals("A", words.getFirstWordWithA(Paths.get("src/test/resources/words2.txt")));
    }

}
