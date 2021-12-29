package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {
    TableCloth tableCloth = new TableCloth(10);

    @Test
    void testGetNumberOfSides() {
        assertEquals(4, tableCloth.getNumberOfSides());
    }

    @Test
    void testGetLengthOfDiagonal() {
        assertEquals(14.142, tableCloth.getLengthOfDiagonal(), 0.001);
    }

    @Test
    void testGetPerimeter() {
        assertEquals(40, tableCloth.getPerimeter());
    }

    @Test
    void testGetArea() {
        assertEquals(100, tableCloth.getArea());
    }

    @Test
    void testGetSide() {
        assertEquals(10, tableCloth.getSide());
    }
}