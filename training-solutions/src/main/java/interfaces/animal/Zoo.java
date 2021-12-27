package interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int count = 0;
        for (Animal actual : animals) {
            count += actual.getNumberOfLegs();
        }
        return count;
    }
}
