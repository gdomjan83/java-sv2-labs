package initializer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {
    private long balance;
    private static final List<Rate> RATES = new ArrayList<>(Arrays.asList(
            new Rate(Currency.EUR, 308.23),
            new Rate(Currency.CHF, 289.24),
            new Rate(Currency.GBP, 362.23),
            new Rate(Currency.USD, 289.77)
    ));

    public CreditCard(long balance, Currency currency) {
        this.balance = Math.round(balance * getConversionFactor(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        double payed = amount * getConversionFactor(currency);
        if (balance >= payed) {
            balance -= payed;
            return true;
        } else {
            return false;
        }
    }

    public boolean payment(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    private double getConversionFactor(Currency currency) {
        for (Rate actual : RATES) {
            if (actual.getCurrency() == currency) {
                return actual.getConversionFactor();
            }
        }
        return 1;
    }
}
