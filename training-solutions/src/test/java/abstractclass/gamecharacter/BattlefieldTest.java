package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattlefieldTest {

    @Test
    void testFight() {
        Random random = new Random(123);
        Battlefield battleField = new Battlefield();
        Character characterArcher = new Archer(new Point(0, 0), 100);
        Character characterWarrior = new AxeWarrior(new Point(5, 0));
        battleField.fight(characterArcher, characterWarrior);

        assertTrue(battleField.getRound() > 0);
        assertTrue(!characterArcher.isAlive() || !characterWarrior.isAlive());
    }

    @Test
    void testFightCloseTogether() {
        Random random = new Random(123);
        Battlefield battleField = new Battlefield();
        Character characterArcher = new Archer(new Point(0, 0), 100);
        Character characterWarrior = new AxeWarrior(new Point(1, 0));
        battleField.fight(characterArcher, characterWarrior);

        assertTrue(battleField.getRound() > 0);
        assertTrue(!characterArcher.isAlive() || !characterWarrior.isAlive());
    }
}