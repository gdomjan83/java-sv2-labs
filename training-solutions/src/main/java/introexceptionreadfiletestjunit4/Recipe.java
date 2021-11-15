package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path) {
        for (int i = 2; i < readFile(path).size(); i++) {
            ingredients.add(readFile(path).get(i).split(" ")[2]);
        }
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File not found.", ioe);
        }
    }
}
