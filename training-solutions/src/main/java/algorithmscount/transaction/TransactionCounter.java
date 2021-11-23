package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int maxLimit) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionType() == TransactionType.CREDIT && transaction.getAmount() < maxLimit) {
                count++;
            }
        }
        return count;
    }
}
