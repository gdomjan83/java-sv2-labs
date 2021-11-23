package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<SalesPerson> people) {
        int sum = 0;
        for (SalesPerson person : people) {
            sum += person.getAmount();
        }
        return sum;
    }
}
