package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.List;

public class Exercise2a {
  /** Given a list of recipes, return the number of vegetarian recipes in the list */
  public static int countVeggies(List<Recipe> recipes) {
    // code here
    // return 0;

    // TODO: Remove solution
    int count = 0;
    for (var recipe : recipes) {
      if (recipe.isVegetarian()) count++;
    }

    return count;
  }

  // TODO: Decide if this is useful - probably not
  List<Recipe> recipes =
      List.of(
          new Recipe("Spaghetti Bolognese", List.of("spaghetti", "beef", "tomato sauce"), 4, false),
          new Recipe(
              "Vegetable Stir Fry",
              List.of("broccoli", "carrots", "bell peppers", "soy sauce"),
              2,
              true));
}
