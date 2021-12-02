package staticattrmeth.dogs;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Dog> dogs = new ArrayList<>();
    private static long code = 1;

    public List<Dog> getDogs() {
        return dogs;
    }

    public static long getCode() {
        return code;
    }

    public void addDog(Dog dog) {
        dog.setCodeNumber(code);
        code++;
        dogs.add(dog);
    }
}
