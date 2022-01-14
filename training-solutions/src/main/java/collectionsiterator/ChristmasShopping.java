package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> christmasPresents;

    public ChristmasShopping(List<ChristmasPresent> christmasPresents) {
        this.christmasPresents = christmasPresents;
    }

    public List<ChristmasPresent> getChristmasPresents() {
        return christmasPresents;
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> i = christmasPresents.iterator();
        while (i.hasNext()) {
            ChristmasPresent next = i.next();
            if (next.getPrice() > maxPrice) {
                i.remove();
            }
        }
    }
}
