package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionSumCalculatorTest {
    @Test
    void testCalculator() {
        TransactionSumCalculator calc = new TransactionSumCalculator();

        List<Transaction> transactions = Arrays.asList(
                new Transaction("12548445-4545425154", TransactionOperation.CREDIT, 480000),
                new Transaction("12548445-4844511569", TransactionOperation.DEBIT, 100000),
                new Transaction("12181155-4485455531", TransactionOperation.CREDIT, 50000)
        );

        assertEquals(530000, calc.sumAmountOfCreditEntries(transactions));
    }
}
