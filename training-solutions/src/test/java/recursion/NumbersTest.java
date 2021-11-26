package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers = new Numbers();

    @Test
    void testNumbers() {
        int result = numbers.getSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(55, result);
    }

}