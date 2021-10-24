package looptypes;

public class Sum {
    public void printSums(int[] numbers) {
        for (var i = 1 ; i < numbers.length; i++) {
            System.out.print((numbers[i] + numbers[i - 1]) + " ");
        }
    }
}
