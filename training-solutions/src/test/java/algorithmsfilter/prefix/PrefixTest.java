package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    @Test
void testPrefix() {
        Prefix prefix = new Prefix();

        List<String> originalWords = Arrays.asList("macska", "kutya", "magyar", "nem", "marha");
        List<String> result = prefix.getWordsStartWith(originalWords, "ma");
        assertEquals(3, result.size());
        assertTrue(result.contains("macska"));
        assertFalse(result.contains("nem"));
    }
}