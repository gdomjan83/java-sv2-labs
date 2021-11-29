package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Trooper not exists.");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        if (name == null || target == null) {
            throw new IllegalArgumentException("Name or target doesn't exist.");
        }
        moveTrooper(findTrooperByName(name), target);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target doesn't exist.");
        }
        moveTrooper(findClosestTrooper(target), target);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper actual : troopers) {
            if (name.equals(actual.getName())) {
                return actual;
            }
        }
        throw new IllegalArgumentException("There is no trooper by that name.");
    }

    private Trooper findClosestTrooper(Position target) {
        double shortestDistance = Double.MAX_VALUE;
        Trooper closest = null;

        for (Trooper actual : troopers) {
            if (actual.distanceFrom(target) < shortestDistance) {
                shortestDistance = actual.distanceFrom(target);
                closest = actual;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position position) {
        trooper.changePosition(position);
    }
}
