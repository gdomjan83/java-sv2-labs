package exception.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {
    NumbersSum numberSum = new NumbersSum();

    @Test
    void testGetSumNumArrayGood() {
        assertEquals(15, numberSum.getSum(new int[] {3, 5, 2, 5}));
    }

    @Test
    void testGetSumNumArrayWrong() {
        int[] input = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numberSum.getSum(input));
        assertEquals("Input can not be null.", iae.getMessage());
    }

    @Test
    void testGetSumStringArrayGood() {
        assertEquals(15, numberSum.getSum(new String[] {"3", "5", "2", "5"}));
    }

    @Test
    void testGetSumStringArrayWrong() {
        String[] input = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numberSum.getSum(input));
        assertEquals("Input can not be null.", iae.getMessage());
    }

    @Test
    void testGetSumStringArrayWrong2() {
        String[] input = new String[] {"3", "K", "2", "5"};
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numberSum.getSum(input));
        assertEquals("Item can not be coverted to number", iae.getMessage());
    }
}