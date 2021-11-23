package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer oldest = trainers.get(0);
        for (Trainer trainer : trainers) {
            if (trainer.getAge() > oldest.getAge()) {
                oldest = trainer;
            }
        }
        return oldest;
    }
}
