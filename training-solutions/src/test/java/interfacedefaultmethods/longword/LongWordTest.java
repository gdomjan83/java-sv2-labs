package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testGetLongWord() {
        LongWord longWord = new LongWord(Paths.get("src/test/resources/longword.txt"));
        assertEquals("LONGWORD", longWord.getLongWord());
    }

    @Test
    void testWrondFile() {
        LongWord longWord = new LongWord(Paths.get("src/test/resources/longwdfeeord.txt"));
        IllegalArgumentException ioe = assertThrows(IllegalArgumentException.class,
                () -> longWord.getLongWord());
        assertEquals("Can not read file.", ioe.getMessage());
    }
}