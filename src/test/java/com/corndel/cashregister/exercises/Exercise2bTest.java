import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class ListNamesTest {

    // This method is analogous to the listNames function in the original code.
    // It returns a list of recipe names (titles).
    public List<String> listNames(List<Recipe> recipes) {
        return recipes.stream().map(recipe -> recipe.name).collect(Collectors.toList());
    }

    @Test
    // Test to ensure correct titles are returned for the given recipes
    void testListNames() {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Spaghetti Bolognese", new String[]{"spaghetti", "beef", "tomato sauce"}, 4, false));
        recipes.add(new Recipe("Vegetable Stir Fry", new String[]{"broccoli", "carrots", "bell peppers", "soy sauce"}, 2, true));

        List<String> expectedTitles = List.of("Spaghetti Bolognese", "Vegetable Stir Fry");

        // Check if the function returns the correct list of titles
        assertEquals(expectedTitles, listNames(recipes));
    }

    @Test
    // Test to ensure the function returns an empty list when there are no recipes
    void testEmptyRecipeList() {
        List<Recipe> emptyRecipes = new ArrayList<>();

        // Check if the function returns an empty list
        assertEquals(List.of(), listNames(emptyRecipes));
    }

    @Test
    // Test to ensure correct titles are returned when there is only one recipe
    void testSingleRecipe() {
        List<Recipe> oneRecipe = new ArrayList<>();
        oneRecipe.add(new Recipe("Pancakes", new String[]{"flour", "milk", "eggs"}, 4, true));

        List<String> expectedTitles = List.of("Pancakes");

        // Check if the function returns the correct single title
        assertEquals(expectedTitles, listNames(oneRecipe));
    }

    @Test
    // Test to handle recipes with different properties and ensure correct titles are returned
    void testVariedRecipes() {
        List<Recipe> variedRecipes = new ArrayList<>();
        variedRecipes.add(new Recipe("Salad", new String[]{"lettuce", "tomatoes"}, 2, true));
        variedRecipes.add(new Recipe("Steak", new String[]{"beef", "seasoning"}, 1, false));
        variedRecipes.add(new Recipe("Soup", new String[]{"broth", "vegetables"}, 3, true));

        List<String> expectedTitles = List.of("Salad", "Steak", "Soup");

        // Check if the function returns the correct list of titles for varied recipes
        assertEquals(expectedTitles, listNames(variedRecipes));
    }
}
