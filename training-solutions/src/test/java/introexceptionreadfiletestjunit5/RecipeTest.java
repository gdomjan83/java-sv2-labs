package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecipeTest {
    Recipe recipe = new Recipe();

    @Test
    public void testAddIngredients() {
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(10, recipe.getIngredients().size());;
        assertEquals("tojás", recipe.getIngredients().get(3));
    }

    @Test
    public void testWrongPathException() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("src/test/resources/recipe15.txt")));
        assertEquals("File not found.", ise.getMessage());
    }
}
