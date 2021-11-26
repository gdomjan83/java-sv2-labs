package recursion;

import java.util.Arrays;

public class Numbers {
    public int getSum(int[] numbers) {
        int sum = 0;
        if (numbers.length > 0) {
           sum = numbers[0] + getSum(Arrays.copyOfRange(numbers, 1, numbers.length));
        }
        return sum;
    }
}
