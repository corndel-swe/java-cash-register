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

public class CountVeggiesTest {

    // This method is analogous to the countVeggies function in the original code.
    // It counts the number of vegetarian recipes in a list.
    public long countVeggies(List<Recipe> recipes) {
        return recipes.stream().filter(recipe -> recipe.isVegetarian).count();
    }

    @Test
    // Test for counting vegetarian recipes
    void testCountVeggies() {
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Spaghetti Bolognese", new String[]{"spaghetti", "beef", "tomato sauce"}, 4, false));
        recipes.add(new Recipe("Vegetable Stir Fry", new String[]{"broccoli", "carrots", "bell peppers", "soy sauce"}, 2, true));

        // Filter recipes to get only vegetarian ones
        long vegetarianRecipesCount = recipes.stream().filter(recipe -> recipe.isVegetarian).count();
        // Check if the count matches the expected number
        assertEquals(vegetarianRecipesCount, countVeggies(recipes));
    }

    @Test
    // Test when there are no vegetarian recipes
    void testNoVegetarianRecipes() {
        List<Recipe> noVegetarianRecipes = new ArrayList<>();
        noVegetarianRecipes.add(new Recipe("Chicken Curry", new String[]{"chicken", "curry sauce"}, 4, false));
        noVegetarianRecipes.add(new Recipe("Beef Stew", new String[]{"beef", "potatoes"}, 6, false));

        // Check if the count is 0 when no vegetarian recipes are present
        assertEquals(0, countVeggies(noVegetarianRecipes));
    }

    @Test
    // Test when all recipes are vegetarian
    void testAllVegetarianRecipes() {
        List<Recipe> allVegetarianRecipes = new ArrayList<>();
        allVegetarianRecipes.add(new Recipe("Vegetarian Salad", new String[]{"lettuce", "tomatoes"}, 2, true));
        allVegetarianRecipes.add(new Recipe("Vegetarian Burger", new String[]{"bun", "veggie patty"}, 1, true));

        // Check if the count matches the total number of recipes
        assertEquals(allVegetarianRecipes.size(), countVeggies(allVegetarianRecipes));
    }

    @Test
    // Test handling of an empty list of recipes
    void testEmptyRecipeList() {
        List<Recipe> emptyRecipes = new ArrayList<>();

        // Check if the count is 0 for an empty list
        assertEquals(0, countVeggies(emptyRecipes));
    }
}
