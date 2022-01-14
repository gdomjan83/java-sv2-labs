package collectionscomp;

import java.util.Objects;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private int area;
    private int floors;

    public Building(String address, int area, int floors) {
        this.address = address;
        this.area = area;
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public int compareTo(Building b) {
        return this.floors - b.floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Building b = (Building) o;
        return this.floors == b.floors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors);
    }

    @Override
    public String toString() {
        return String.format("Address: %s, area: %d, floors: %d", address, area, floors);
    }

    public static void main(String[] args) {
        TreeSet<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Veszprém, Egyetem utca 10", 1500, 3));
        buildings.add(new Building("Budapest, Népstadion", 20000, 5));
        buildings.add(new Building("Zalalövő, Széchenyi u. 3", 90, 1));

        System.out.println(buildings);
    }
}
