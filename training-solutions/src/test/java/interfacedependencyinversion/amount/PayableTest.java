package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    Payable amount = new Amount();
    Payable cash = new Cash();
    Payable atm = new BankAtm();

    @Test
    public void amountTest() {
        assertEquals(1521, amount.getPayableAmount(1521));
    }

    @Test
    public void cashTest() {
        assertEquals(1520, cash.getPayableAmount(1520));
        assertEquals(1520, cash.getPayableAmount(1521));
        assertEquals(1525, cash.getPayableAmount(1524));
        assertEquals(1525, cash.getPayableAmount(1525));
        assertEquals(1525, cash.getPayableAmount(1526));
        assertEquals(1530, cash.getPayableAmount(1528));
    }

    @Test
    public void atmTest() {
        assertEquals(2000, atm.getPayableAmount(2000));
        assertEquals(2000, atm.getPayableAmount(1528));
    }
}