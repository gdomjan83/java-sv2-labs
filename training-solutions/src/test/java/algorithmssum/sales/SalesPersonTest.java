package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesPersonTest {
    @Test
    void testCreate() {
        SalesPerson person = new SalesPerson("Domján Gábor", 2_540_000);

        assertEquals("Domján Gábor", person.getName());
        assertEquals(2_540_000, person.getAmount());
    }
}
