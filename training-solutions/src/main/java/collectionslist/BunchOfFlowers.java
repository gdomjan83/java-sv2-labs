package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> flowers = new LinkedList<>();

    public List<String> getBunch() {
        return new LinkedList<>(flowers);
    }

    public void addFlower(String flower) {
        flowers.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        if (flowers.size() % 2 == 0) {
            flowers.add(flowers.size() / 2, flower);
        } else {
            int middle = flowers.size() / 2;
            flowers.add(middle, flower);
            flowers.add(middle + 2, flower);
        }
    }
}
