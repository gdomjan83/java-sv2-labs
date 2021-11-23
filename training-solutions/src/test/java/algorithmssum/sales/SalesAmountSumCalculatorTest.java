package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {
    @Test
    void testSumCalculator() {
        SalesAmountSumCalculator calc = new SalesAmountSumCalculator();

        List<SalesPerson> people = new ArrayList<>();
        people.add(new SalesPerson("Domján Gábor", 2_540_000));
        people.add(new SalesPerson("Keller Tamás", 1_000_000));
        people.add(new SalesPerson("Zaránd Alina", 2_300_000));

        assertEquals(5_840_000, calc.sumSalesAmount(people));
    }
}
