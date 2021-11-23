package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> accountList, int lowerLimit) {
        int count = 0;
        for (BankAccount account : accountList) {
            if (account.getBalance() > lowerLimit) {
                count++;
            }
        }
        return count;
    }
}
