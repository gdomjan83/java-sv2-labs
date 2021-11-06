package controliteration.division;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {

    @Test
    void testDivisionFor() {
        Division division = new Division(22, 4);
        assertEquals("4, 8, 12, 16, 20, ", division.generateResultWithFor());
    }

    @Test
    void testDivisionWhile() {
        Division division = new Division(35, 3);
        assertEquals("3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, ", division.generateResultWithWhile());
    }

}