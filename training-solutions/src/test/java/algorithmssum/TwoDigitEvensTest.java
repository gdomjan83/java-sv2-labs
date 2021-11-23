package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDigitEvensTest {
    @Test
    void testSum() {
        TwoDigitEvens tde = new TwoDigitEvens();

        assertEquals(60, tde.getSum(11, 20));
        assertEquals(1980, tde.getSum(11, 100));
    }
}
