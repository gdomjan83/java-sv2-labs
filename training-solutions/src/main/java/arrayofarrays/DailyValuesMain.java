package arrayofarrays;

import java.time.Month;

public class DailyValuesMain {
    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        ArrayOfArrays arrPrinter = new ArrayOfArrays();

        arrPrinter.printArrayOfArrays(dailyValues.getValues());
    }
}
