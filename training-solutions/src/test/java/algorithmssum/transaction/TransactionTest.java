package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    @Test
    void testCreate() {
        Transaction transaction = new Transaction("12548445-4545425154", TransactionOperation.CREDIT, 480000);

        assertEquals("12548445-4545425154", transaction.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertEquals(480000, transaction.getAmount());
    }
}
