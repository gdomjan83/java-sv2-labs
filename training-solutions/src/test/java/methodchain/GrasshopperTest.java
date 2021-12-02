package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {
    Grasshopper grasshopper = new Grasshopper();

    @Test
    void testHopOnce() {
        grasshopper.hopOnce(Direction.POSITIVE);
        assertEquals(1, grasshopper.getPosition());

        grasshopper.hopOnce(Direction.NEGATIVE);
        assertEquals(0, grasshopper.getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops() {
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grasshopper.getPosition());
    }
}