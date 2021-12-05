package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {
    @Test
    void testCreation() {
        Random random = new Random(123);
        Character character = new Archer(new Point(5, 10), 100);

        assertEquals(100, character.getHitPoint());
        assertTrue(character.isAlive());
        assertEquals(5L, character.getPosition().getXPos());
        assertEquals(10L, character.getPosition().getYPos());
    }

    @Test
    void testKill() {
        Random random = new Random(123);
        Archer offender = new Archer(new Point(0, 0), 100);
        Character defender = new Archer(new Point(12, 0), 100);
        while (defender.getHitPoint() > 0) {
            offender.secondaryAttack(defender);
        }

        assertTrue(defender.getHitPoint() <= 0);
        assertFalse(defender.isAlive());
    }

    @Test
    void testSecondaryAttack() throws Exception {
        Random random = new Random(123);
        Archer offender = new Archer(new Point(0, 0), 100);
        Character defender = new Archer(new Point(12, 0), 100);
        offender.secondaryAttack(defender);

        assertEquals(100, offender.getHitPoint());
        assertTrue(defender.getHitPoint() >= 96);
        assertEquals(99, offender.getNumberOfArrow());
    }
}