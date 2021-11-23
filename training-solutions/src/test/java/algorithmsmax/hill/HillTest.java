package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {
    @Test
    void testHeight() {
        Hill hill = new Hill();

        int max = hill.getMax(Arrays.asList(1580, 2600, 1000 , 8500, 1110, 7000));
        assertEquals(8500, max);
    }

}