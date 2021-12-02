package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiedWordTest {
    @Test
    void testModify() {
        ModifiedWord modifiedWord = new ModifiedWord();

        String result1 = modifiedWord.modifyWord("alma");
        String result2 = modifiedWord.modifyWord("körte");
        String result3 = modifiedWord.modifyWord("szilva");

        assertEquals("AxMy", result1);
        assertEquals("KxRy", result2);
        assertEquals("SxIy", result3);
    }
}
