package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {
    private List<Flat> flats = new ArrayList<>();

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public Flat findFirstCheaperFlat(int minPrice) {
        Flat result = findFirst(flat -> flat.getPrice() < minPrice);
        return result;
    }

    public Flat findFirstGreaterFlat(double maxArea) {
        Flat result = findFirst(flat -> flat.getArea() > maxArea);
        return result;
    }

    public Flat findFirstFlatInSameTown(String town) {
        Flat result = findFirst(flat -> flat.getAddress().startsWith(town));
        return result;
    }

    private Flat findFirst(Predicate<Flat> condition) {
        for (Flat actual : flats) {
            if (condition.test(actual)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }
}
