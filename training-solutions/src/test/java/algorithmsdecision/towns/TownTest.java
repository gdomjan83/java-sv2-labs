package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    @Test
    void testPopulationLimit() {
        Town town = new Town();

        boolean result = town.containsFewerHabitants(Arrays.asList(2580, 3500, 1500, 9545, 2100), 2000);
        assertTrue(result);
        boolean result2 = town.containsFewerHabitants(Arrays.asList(2580, 3500, 1500, 9545, 2100), 1000);
        assertFalse(result2);
    }
}