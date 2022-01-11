package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> rightAnswers = new ArrayList<>();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();
        Random rnd = new Random();
        while (winners.size() < 5) {
            if (rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            RightAnswer draw = rightAnswers.get(rnd.nextInt(rightAnswers.size()));
            winners.add(draw.getPlayerName());
            rightAnswers.remove(draw);
        }
        return winners;
    }
}
