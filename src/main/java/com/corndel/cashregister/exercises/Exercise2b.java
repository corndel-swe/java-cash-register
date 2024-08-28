package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2b {
  /** Given an array of recipes, return a new array of strings containing the name of each recipe */
  public static List<String> listNames(List<Recipe> recipes) {
    // code here
    // return null;

    // TODO: Remove
    return recipes.stream().map(recipe -> recipe.getName()).collect(Collectors.toList());
  }
}
//
// // array provided for debugging:
// const recipes = [
//   {
//     name: "Spaghetti Bolognese",
//     ingredients: ["spaghetti", "beef", "tomato sauce"],
//     servings: 4,
//     isVegetarian: false
//   },
//
//   {
//     name: "Vegetable Stir Fry",
//     ingredients: ["broccoli", "carrots", "bell peppers", "soy sauce"],
//     servings: 2,
//     isVegetarian: true
//   }
// ]
//
// // don"t change below
// export default listNames
//
// }
