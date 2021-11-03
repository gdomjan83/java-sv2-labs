package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("ShenLong", 1, 15.25);
        String name = "ShenLong";

        assertEquals(name, dragon.getName());
        assertNotEquals("Süsü", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("ShenLong", 1, 15.25);
        int heads = 1;

        assertEquals(heads, dragon.getNumberOfHeads());
        assertNotEquals(3, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() > 1);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("ShenLong", 1, 15.25);
        double height = 15.25;

        assertEquals(height, dragon.getHeights(), 0.005);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("ShenLong", 1, 15.25);
        Dragon anotherDragon = null;

        assertNull(anotherDragon);
        assertNotNull(dragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("ShenLong", 1, 15.25);
        Dragon anotherDragon = dragon;

        assertSame(dragon, anotherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("ShenLong", 1, 15.25);
        Dragon anotherDragon = new Dragon("ShenLong", 1, 15.25);

        assertNotSame(dragon, anotherDragon);
    }
}
