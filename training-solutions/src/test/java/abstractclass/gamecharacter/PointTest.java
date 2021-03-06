package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void testCreation() {
        Point point = new Point(5, 6);

        assertEquals(5L, point.getXPos());
        assertEquals(6L, point.getYPos());
    }

    @Test
    void testGetDistance() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(100, 100);

        assertEquals(141L, point1.distance(point2));
    }
}