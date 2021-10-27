package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colours = new ArrayList<>();

    public void addFirst(String colour) {
        colours.add(0, colour);
    }

    public void addLast(String colour) {
        colours.add(colour);
    }

    public void removeFirst() {
        colours.remove(0);
    }

    public void removeLast() {
        int size = colours.size();
        colours.remove(size - 1);
    }

    public List<String> getColours() {
        return colours;
    }
}
