package arrays;

import java.util.Arrays;

public class ArraysMainTest {
    public static void main(String[] args) {
        ArraysMain arr = new ArraysMain();

        System.out.println("Hónapok napjai:\n" + arr.numberOfDaysAsString());
        System.out.println();

        System.out.println("6-os szorzótábla:\n" + arr.multiplicationTableAsString(6));
        System.out.println();

        double[] day = {5.1, 5.5, 6.0, 7.3, 8.0, 10.2, 9.5,
                10.6, 11.5, 15.6, 18.9, 20.0, 18.5, 16.3, 15.5,
                15.0, 14.1, 13.0, 13.0, 12.0, 11.1, 11.0, 9.9, 9.9};
        double[] anotherDay = {10.0, 5.5, 6.0, 7.3, 8.0, 10.2, 9.5,
                10.6, 11.5, 15.6, 18.9, 20.0, 18.5, 16.3, 15.5,
                15.0, 14.1, 13.0, 13.0, 12.0, 11.1, 11.0, 9.9, 9.9};

        System.out.println("Napok összehasonlítása:\n" + arr.sameTempValues(day, anotherDay));
        System.out.println();

        double[] shortDay = {5.1, 5.5, 6.0, 7.3, 8.0, 10.2, 9.5,
                10.6, 11.5, 15.6, 18.9, 20.0, 18.5, 16.3, 15.5,
                15.0, 14.1, 13.0, 13.0, 12.0, 11.1, 11.0, 9.9, 9.9};
        double[] longDay =  {5.1, 5.5, 6.0, 7.3, 8.0, 10.2, 9.5,
                10.6, 11.5, 15.6, 18.9, 20.0, 18.5, 16.3, 15.5,
                15.0, 14.1, 13.0, 13.0, 12.0, 11.1, 11.0, 9.9, 9.9, 8.0};

        System.out.println("Eltérő hosszúságú napok összehasonlítása:\n" + arr.sameTempValuesDayLight(shortDay, longDay));
        System.out.println();

        int[] playedNumbers = {32, 60, 12, 20, 75};
        int[] winningNumbers = {90, 64, 71, 60, 30};

        System.out.println("Megjátszott számok sorbarendezés előtt: " + Arrays.toString(playedNumbers));
        System.out.println("Nyert a lottón?\n" + arr.wonLottery(playedNumbers, winningNumbers));
        System.out.println("Megjátszott számok sorbarendezés után: " + Arrays.toString(playedNumbers));

    }
}
