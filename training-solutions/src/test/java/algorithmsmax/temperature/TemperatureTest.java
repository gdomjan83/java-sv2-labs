package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void testTemp() {
        Temperature temp = new Temperature();

        int min = temp.getMin(Arrays.asList(25, 20, 32, 15, 5, 2, 12));
        assertEquals(2, min);
    }
}