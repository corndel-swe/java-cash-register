import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// Sample recipes for testing
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

public class RecipeSummaryTest {

    // This method is analogous to the recipeSummary function in the original code.
    // It generates a summary string for a given recipe.
    public String recipeSummary(Recipe recipe) {
        return recipe.name + " has " + recipe.ingredients.length + " ingredients and serves " + recipe.servings + " people";
    }

    // Sample recipes for testing
    Recipe recipe1 = new Recipe(
            "Spaghetti Bolognese",
            new String[]{"spaghetti", "beef", "tomato sauce"},
            4,
            false
    );

    Recipe recipe2 = new Recipe(
            "Vegetable Stir Fry",
            new String[]{"broccoli", "carrots", "bell peppers", "soy sauce"},
            2,
            true
    );

    @Test
    // Test for Spaghetti Bolognese
    void testSpaghettiBologneseSummary() {
        String expectedSummary = "Spaghetti Bolognese has 3 ingredients and serves 4 people";
        // Check if the generated summary matches the expected summary
        assertEquals(expectedSummary, recipeSummary(recipe1));
    }

    @Test
    // Test for Vegetable Stir Fry
    void testVegetableStirFrySummary() {
        String expectedSummary = "Vegetable Stir Fry has 4 ingredients and serves 2 people";
        // Check if the generated summary matches the expected summary
        assertEquals(expectedSummary, recipeSummary(recipe2));
    }
}
