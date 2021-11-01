package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {
    private List<String> names = Arrays.asList("Gábor", "Alina", "Kata", "Zoltán");

    public List<String> getNames() {
        return names;
    }

    public static void main(String[] args) {
        Thanks thanks = new Thanks();

        for (String name: thanks.getNames()) {
            System.out.printf("Kedves %s! Örülünk, hogy a termékünket választotta.\n", name);
        }
    }
}
