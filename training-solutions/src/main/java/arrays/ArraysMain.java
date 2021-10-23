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

    public String multiplicationTableAsString(int size) {
        int[][] table = new int[size][];

        for (int i = 0; i < table.length; i++) {
            table[i] = new int[size];
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public int min(int value1, int value2) {
        if (value1 <= value2) {
            return value1;
        } else {
            return value2;
        }
    }

    public boolean sameTempValuesDayLight(double[] day, double[] anotherDay) {
        int dayLength = day.length;
        int anotherDayLength = anotherDay.length;

        int shorterLength = min(dayLength, anotherDayLength);

        return Arrays.equals(Arrays.copyOfRange(day, 0, shorterLength), Arrays.copyOfRange(anotherDay, 0, shorterLength));
    }

    public boolean wonLottery(int[] playedNumbers, int[] winningNumbers) {


        return true;
    }
}
