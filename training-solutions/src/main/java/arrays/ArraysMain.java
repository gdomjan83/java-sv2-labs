package arrays;

import java.time.Month;
import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = new int[12];
        for (int i = 0; i < numberOfDays.length; i++) {
            numberOfDays[i] = Month.of(i + 1).length(false);
        }
        return Arrays.toString(numberOfDays);
    }
}
