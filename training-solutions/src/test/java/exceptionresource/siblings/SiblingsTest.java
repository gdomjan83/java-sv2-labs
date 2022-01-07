package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {
    Siblings siblings = new Siblings();

    @Test
    void testGetFullNamesCorrect() {
        List<String> result = List.of("Tóth Emese", "Tóth Kristóf", "Tóth János", "Tóth Alina");
        List<String> input = siblings.getFullNames("Tóth", Paths.get("src/test/resources/names.txt"));
        assertEquals(result, input);
    }

    @Test
    void testGetFullNamesReadError() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> siblings.getFullNames("Tóth", Paths.get("src/test/resources/name332s.txt")));
        assertEquals("Can't read file.", iae.getMessage());
    }

}