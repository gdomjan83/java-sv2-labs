package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] arrayOfNumbers = {2, 3, 5, 6, 8, 11, 14};
        int[] evenNumbers = {2, 0, 0, 6, 8, 0, 14};

        assertArrayEquals(evenNumbers, numbers.getEvenNumbers(arrayOfNumbers));
    }
}
