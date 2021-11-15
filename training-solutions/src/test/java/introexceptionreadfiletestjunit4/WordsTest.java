package introexceptionreadfiletestjunit4;

import org.junit.Test;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

    @Test
    public void testRead() {
        String name = new Words().getFirstWordWithA(Paths.get("src/test/resources/words.txt"));
        assertEquals("Anna", name);
    }

    @Test
    public void testReadWrong() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> new Words().getFirstWordWithA(Paths.get("src/test/resources/words111.txt")));
        assertEquals("File not found", ise.getMessage());
    }

    @Test
    public void testRead2() {
        String name = new Words().getFirstWordWithA(Paths.get("src/test/resources/words2.txt"));
        assertEquals("A", name);
    }
}
