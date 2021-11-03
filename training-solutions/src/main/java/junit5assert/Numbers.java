package junit5assert;

public class Numbers {
    public int[] getEvenNumbers(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                evenNumbers[i] = 0;
            } else {
                evenNumbers[i] = numbers[i];
            }
        }
        return evenNumbers;
    }
}
