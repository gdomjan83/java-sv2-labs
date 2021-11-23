package algorithmscount;

public class Digits {
    public int getCountOfNumbers(int starts, int ends) {
        int count = 0;
        for (int i = starts; i < ends; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (Math.abs(firstDigit - secondDigit) == 5) {
                count++;
            }
        }
        return count;
    }
}
