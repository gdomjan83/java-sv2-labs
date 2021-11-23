package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {
    @Test
    void testCounter() {
        TransactionCounter tc = new TransactionCounter();

        List<Transaction> transactions = Arrays.asList(
            new Transaction("12548445-4545425154", TransactionType.CREDIT, 480_000),
            new Transaction("12548445-4844511569", TransactionType.DEBIT, 100_000),
            new Transaction("12181155-4485455531", TransactionType.CREDIT, 50_000)
        );

        int count = tc.countEntryLessThan(transactions,150_000);
        assertEquals(1, count);
    }
}