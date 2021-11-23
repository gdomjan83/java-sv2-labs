package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson person = sales.get(0);
        for (Salesperson actual : sales) {
            if (actual.getAmount() > person.getAmount()) {
                person = actual;
            }
        }
        return person;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson person = sales.get(0);
        for (Salesperson actual : sales) {
            int actualSalesDifference = actual.getAmount() - actual.getTarget();
            int currentHightestSalesDifference = person.getAmount() - person.getTarget();
            if (actualSalesDifference > currentHightestSalesDifference) {
                person = actual;
            }
        }
        return person;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson person = sales.get(0);
        for (Salesperson actual : sales) {
            int actualSalesDifference = actual.getAmount() - actual.getTarget();
            int currentLowestSalesDifference = person.getAmount() - person.getTarget();
            if (actualSalesDifference < currentLowestSalesDifference) {
                person = actual;
            }
        }
        return person;
    }
}
