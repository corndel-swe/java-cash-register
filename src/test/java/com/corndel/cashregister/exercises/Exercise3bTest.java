import static org.junit.jupiter.api.Assertions.assertEquals;

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

public class CountServingsTest {

    // This method is analogous to the countServings function in the original code.
    // It returns the total number of servings in the recipe book.
    public int countServings(RecipeBook book) {
        return book.recipes.stream().mapToInt(recipe -> recipe.servings).sum();
    }

    @Test
    // Test to ensure the total number of servings is correctly counted
    void testTotalServings() {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Spaghetti Bolognese", new String[]{"spaghetti", "beef", "tomato sauce"}, 4, false));
        recipes.add(new Recipe("Vegetable Stir Fry", new String[]{"broccoli", "carrots", "bell peppers", "soy sauce"}, 2, true));
        
        RecipeBook recipeBook = new RecipeBook("My Recipe Book", recipes);
        
        int expectedServings = 6;
        // Check if the function returns the correct total number of servings
        assertEquals(expectedServings, countServings(recipeBook));
    }

    @Test
    // Test to ensure the function returns 0 when there are no recipes
    void testNoRecipes() {
        RecipeBook emptyRecipeBook = new RecipeBook("Empty Recipe Book", new ArrayList<>());
        
        // Check if the function returns 0 when there are no recipes
        assertEquals(0, countServings(emptyRecipeBook));
    }

    @Test
    // Test to ensure the correct number of servings is returned when there is only one recipe
    void testSingleRecipe() {
        List<Recipe> oneRecipe = new ArrayList<>();
        oneRecipe.add(new Recipe("Pancakes", new String[]{"flour", "milk", "eggs"}, 4, true));
        
        RecipeBook oneRecipeBook = new RecipeBook("Single Recipe Book", oneRecipe);
        
        int expectedServings = 4;
        // Check if the function returns the correct number of servings
        assertEquals(expectedServings, countServings(oneRecipeBook));
    }

    @Test
    // Test to ensure the correct number of servings is returned with multiple recipes
    void testMultipleRecipes() {
        List<Recipe> multipleRecipes = new ArrayList<>();
        multipleRecipes.add(new Recipe("Salad", new String[]{"lettuce", "tomatoes"}, 2, true));
        multipleRecipes.add(new Recipe("Steak", new String[]{"beef", "seasoning"}, 3, false));
        multipleRecipes.add(new Recipe("Soup", new String[]{"broth", "vegetables"}, 4, true));
        
        RecipeBook multipleRecipesBook = new RecipeBook("Multiple Recipes Book", multipleRecipes);
        
        int expectedServings = 9;
        // Check if the function returns the correct total number of servings
        assertEquals(expectedServings, countServings(multipleRecipesBook));
    }
}
