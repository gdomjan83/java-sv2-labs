package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "staruday", "sunday"};
        System.out.println(days[1]);
        System.out.println("A tömb hossza: " + days.length);

        int[] twoPowers = new int[5];
        for (var i = 0; i < twoPowers.length; i++) {
            if (i > 0) {
                twoPowers[i] = twoPowers[i - 1] * 2;
            } else {
                twoPowers[i] = 1;
            }
        }
        for (int item: twoPowers) {
            System.out.print(item + " ");
        }

        System.out.println();

        boolean[] boolArray = new boolean[6];
        for (var i = 0; i < boolArray.length; i++) {
            if (i > 0) {
                boolArray[i] = !boolArray[i - 1];
            } else {
                boolArray[i] = false;
            }
        }
        for (boolean item: boolArray) {
            System.out.print(item + " ");
        }
    }
}
