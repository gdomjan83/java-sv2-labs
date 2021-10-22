package arrayofarrays;

import java.time.Month;

public class DailyValues {
    public int[][] getValues() {
        int[][] arr = new int[12][];
        for (int i = 0; i < arr.length; i++) {
            int monthLength = Month.of(i + 1).length(false);
            arr[i] = new int[monthLength];
        }
        return arr;
    }
}
