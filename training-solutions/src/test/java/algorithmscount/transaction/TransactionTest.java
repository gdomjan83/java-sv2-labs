package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void testCreate() {
        Transaction transaction = new Transaction("12548445-4545425154", TransactionType.CREDIT, 480000);

        assertEquals("12548445-4545425154", transaction.getAccountNumber());
        assertEquals(TransactionType.CREDIT, transaction.getTransactionType());
        assertEquals(480000, transaction.getAmount());
    }

}