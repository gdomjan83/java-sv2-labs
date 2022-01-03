package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public void payment(String accountNumber, double amount) {
        boolean found = false;
        for (Account a : accounts) {
            if (accountNumber.equals(a.getAccountNumber())) {
                a.subtract(amount);
                found = true;
            }
        }
        if (!found) {
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
    }

    public void deposit(String accountNumber, double amount) {
        boolean found = false;
        for (Account a : accounts) {
            if (accountNumber.equals(a.getAccountNumber())) {
                a.deposit(amount);
                found = true;
            }
        }
        if (!found) {
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }
    }


}
