package algorithmscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {
    @Test
    void testDigitCounter() {
        Digits digits = new Digits();

        int count = digits.getCountOfNumbers(11, 30);
        assertEquals(2, count);
        int count2 = digits.getCountOfNumbers(11, 100);
        assertEquals(9, count2);
    }
}