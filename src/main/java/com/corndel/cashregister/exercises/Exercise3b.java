package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.RecipeBook;

public class Exercise3b {
  /** Given a recipeBook containing recipes, returns the total number of servings in the book */
  public static int countServings(RecipeBook recipeBook) {
    // code here
    // return 0

    return recipeBook.getRecipes().stream().mapToInt(recipe -> recipe.getServings()).sum();
  }
}
//
// // we"ve provided a sample object for debugging:
// const recipeBook = {
//   title: "My Recipe Book",
//   recipes: [
//     {
//       name: "Spaghetti Bolognese",
//       ingredients: ["spaghetti", "beef", "tomato sauce"],
//       servings: 4,
//       isVegetarian: false
//     },
//
//     {
//       name: "Vegetable Stir Fry",
//       ingredients: ["broccoli", "carrots", "bell peppers", "soy sauce"],
//       servings: 2,
//       isVegetarian: true
//     }
//   ]
// }
