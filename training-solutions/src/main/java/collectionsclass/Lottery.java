package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        Random rnd = new Random();
        List<Integer> numbersTotal = prepareBalls(ballCount);
        return drawBalls(numbersTotal, lotteryType, rnd);
    }

    private List<Integer> prepareBalls(int ballCount) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < ballCount; i++) {
            numbers.add(i + 1);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    private List<Integer> drawBalls(List<Integer> numbersTotal, int lotteryType, Random random) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < lotteryType; i++) {
            int randomNumber = random.nextInt(0, numbersTotal.size());
            result.add(numbersTotal.get(randomNumber));
            numbersTotal.remove(randomNumber);
        }
        Collections.sort(result);
        return result;
    }
}
