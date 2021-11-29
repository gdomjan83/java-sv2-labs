package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> drives) {
        Pendrive best = drives.get(0);
        for (int i = 1; i < drives.size(); i++) {
            if (best.comparePricePerCapacity(drives.get(i)) == 1) {
                best = drives.get(i);
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> drives) {
        Pendrive cheapest = drives.get(0);
        for (int i = 1; i < drives.size();  i++) {
            if (!cheapest.isCheaperThan(drives.get(i))) {
                cheapest = drives.get(i);
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> drives, int percent, int capacity) {
        for (Pendrive actual : drives) {
            if (actual.getCapacity() == capacity) {
                actual.risePrice(percent);
            }
        }
    }
}
