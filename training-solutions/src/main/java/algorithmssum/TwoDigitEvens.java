package algorithmssum;

public class TwoDigitEvens {

    public int getSum(int lowerLimit, int upperLimit) {
        int sum = 0;
        for (int i = lowerLimit; i < upperLimit; i += 2) {
            if (i % 5!= 0) {
                sum += i;
            }
        }
        return sum;
    }
}
