package streams;

import java.util.ArrayList;
import java.util.List;

public class Cake {
    private String name;
    private List<String> ingridients;

    public Cake(String name, List<String> ingridients) {
        this.name = name;
        this.ingridients = ingridients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngridients() {
        return new ArrayList<>(ingridients);
    }
}
