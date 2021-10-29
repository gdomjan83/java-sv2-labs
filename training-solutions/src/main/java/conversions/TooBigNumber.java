package conversions;

public class TooBigNumber {
    public long getRighResult(int number) {
        long max = Integer.MAX_VALUE;
        return max + number;
    }


    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();

        System.out.println(tooBigNumber.getRighResult(10));


    }
}

