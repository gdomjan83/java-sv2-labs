package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> towns, int populationLimit) {
        for (Integer pop : towns) {
            if (pop < populationLimit) {
                return true;
            }
        }
        return false;
    }
}
