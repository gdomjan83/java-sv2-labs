package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConditionCounterTest {
    @Test
    void testCounter() {
        BankAccountConditionCounter bac = new BankAccountConditionCounter();

        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Jack", "45441851-448453488", 1500),
                new BankAccount("John", "8885155145-454541415", 2000),
                new BankAccount("Jill", "1288845454-89451515", 1800)
        );
        int count = bac.countWithBalanceGreaterThan(accounts, 1600);
        assertEquals(2, count);
    }
}
