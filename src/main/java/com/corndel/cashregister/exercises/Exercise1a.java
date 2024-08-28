package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.List;

public class Exercise1a {
  /**
   * Accepts a recipe object and returns a summary string as below: "Spaghetti Bolognese has 3
   * ingredients and serves 4 people" "Vegetable Stir Fry has 4 ingredients and serves 2 people"
   */
  public static String getSummary(Recipe recipe) {
    // TODO: Remove solution
    return recipe.getName()
        + " has "
        + recipe.getIngredients().size()
        + " ingredients and serves "
        + recipe.getServings()
        + " people";
  }

  // Example recipies
  // TODO: Do we need these if we have types from Recipe?
  private static Recipe recipe1 =
      new Recipe("Spaghetti Bolognese", List.of("spaghetti", "beef", "tomato sauce"), 4, false);

  private static Recipe recipe2 =
      new Recipe(
          "Vegetable Stir Fry",
          List.of("broccoli", "carrots", "bell peppers", "soy sauce"),
          2,
          true);
}
