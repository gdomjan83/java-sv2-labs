package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CookBook {
    private List<Cake> cakes;

    public CookBook(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public List<Cake> getCakes() {
        return new ArrayList<>(cakes);
    }

    public void addCake(Cake cake) {
        cakes.add(cake);
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        return cakes.stream()
                .filter(cake -> cake.getIngridients().contains(ingredient))
                .map(Cake::getName)
                .collect(Collectors.toList());
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        return cakes.stream()
                .filter(cake -> cake.getIngridients().size() <= max)
                .map(Cake::getName)
                .collect(Collectors.toList());
    }
}
