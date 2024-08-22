import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

// Class representing a Recipe
class Recipe {
    String name;
    String[] ingredients;
    int servings;
    boolean isVegetarian;

    Recipe(String name, String[] ingredients, int servings, boolean isVegetarian) {
        this.name = name;
        this.ingredients = ingredients;
        this.servings = servings;
        this.isVegetarian = isVegetarian;
    }
}

// Class representing a RecipeBook
class RecipeBook {
    String title;
    List<Recipe> recipes;

    RecipeBook(String title, List<Recipe> recipes) {
        this.title = title;
        this.recipes = recipes;
    }
}

public class LastRecipeTest {

    // This method is analogous to the lastRecipe function in the original code.
    // It returns the name of the last recipe in the recipe book.
    public String lastRecipe(RecipeBook book) {
        if (book.recipes.isEmpty()) {
            return null;
        } else {
            return book.recipes.get(book.recipes.size() - 1).name;
        }
    }

    @Test
    // Test to ensure the title of the last recipe is returned
    void testLastRecipeTitle() {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Spaghetti Bolognese", new String[]{"spaghetti", "beef", "tomato sauce"}, 4, false));
        recipes.add(new Recipe("Vegetable Stir Fry", new String[]{"broccoli", "carrots", "bell peppers", "soy sauce"}, 2, true));
        
        RecipeBook recipeBook = new RecipeBook("My Recipe Book", recipes);
        
        String expectedTitle = "Vegetable Stir Fry";
        // Check if the function returns the correct title
        assertEquals(expectedTitle, lastRecipe(recipeBook));
    }

    @Test
    // Test to ensure the function returns null when there are no recipes
    void testNoRecipes() {
        RecipeBook emptyRecipeBook = new RecipeBook("Empty Recipe Book", new ArrayList<>());
        
        // Check if the function returns null
        assertNull(lastRecipe(emptyRecipeBook));
    }

    @Test
    // Test to ensure the title is returned correctly when there is only one recipe
    void testSingleRecipe() {
        List<Recipe> oneRecipe = new ArrayList<>();
        oneRecipe.add(new Recipe("Pancakes", new String[]{"flour", "milk", "eggs"}, 4, true));
        
        RecipeBook oneRecipeBook = new RecipeBook("Single Recipe Book", oneRecipe);
        
        String expectedTitle = "Pancakes";
        // Check if the function returns the correct title
        assertEquals(expectedTitle, lastRecipe(oneRecipeBook));
    }
}
