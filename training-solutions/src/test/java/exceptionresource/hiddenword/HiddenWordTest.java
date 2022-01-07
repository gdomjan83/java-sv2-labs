package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {
    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void testHiddenWord() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(Paths.get("src/test/resources/hiddenword.txt")));
    }

    @Test
    void testHiddenWordWrongPath() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> hiddenWord.getHiddenWord(Paths.get("src/test/resources/hiddenword00.txt")));
        assertEquals("Can't read file.", iae.getMessage());
    }

}