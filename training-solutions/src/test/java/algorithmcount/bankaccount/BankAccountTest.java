package algorithmcount.bankaccount;

import algorithmscount.bankaccount.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void testCreate() {
        BankAccount account = new BankAccount("Jack", "548454545-448454548", 1500);
        assertEquals("Jack", account.getNameOfOwner());
        assertEquals("548454545-448454548", account.getAccountNumber());
        assertEquals(1500, account.getBalance());
    }
}
