package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Titanic", 1920, 250.5);
    }

    @Test
    void testName() {
        assertEquals("Titanic", ship.getName());
        assertNotEquals("USS Enterprise", ship.getName());
    }

    @Test
    void testYearOfConstrucion() {
        assertEquals(1920, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1920);
        assertFalse(ship.getYearOfConstruction() == 1950);
    }

    @Test
    void testLength() {
        assertEquals(250.5, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;

        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;

        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Titanic", 1920, 250.5);

        assertNotSame(ship, anotherShip);
    }
}
