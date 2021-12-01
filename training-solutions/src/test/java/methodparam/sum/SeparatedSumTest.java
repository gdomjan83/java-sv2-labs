package methodparam.sum;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    SeparatedSum separatedSum = new SeparatedSum();

    @Test
    void testSumNumbers() {
        SummedNumbers summedNumbers = separatedSum.sum(separatedSum.readFile(Paths.get("src/test/resources/floatingnumbers.txt")));

        assertEquals(110.6, summedNumbers.getPositiveNumberSum(), 0.0001);
        assertEquals(-153.3, summedNumbers.getNegativeNumbersSum(), 0.0001);
    }

    @Test
    void testWrongPath() {
        IllegalArgumentException iea = assertThrows(IllegalArgumentException.class,
                () -> separatedSum.sum(separatedSum.readFile(Paths.get("src/test/resources/floatingnu.txt"))));
    }
}