package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {
    @Test
    void testCreation() {
        Random random = new Random(123);
        Character character = new AxeWarrior(new Point(5, 10));

        assertEquals(100, character.getHitPoint());
        assertTrue(character.isAlive());
        assertEquals(5L, character.getPosition().getXPos());
        assertEquals(10L, character.getPosition().getYPos());
    }

    @Test
    void testSecondaryAttack() {
        Random random = new Random(123);
        Character offender = new AxeWarrior(new Point(0, 0));
        Character defender = new AxeWarrior(new Point(0, 0));
        offender.secondaryAttack(defender);

        assertEquals(100, offender.getHitPoint());
        assertTrue(defender.getHitPoint() >= 80);
    }
}