import { describe, it } from 'mocha'
import assert from 'assert'
import lastRecipe from '../exercises/3a.js'

// Sample recipeBook for testing
const recipeBook = {
  title: 'My Recipe Book',
  recipes: [
    {
      name: 'Spaghetti Bolognese',
      ingredients: ['spaghetti', 'beef', 'tomato sauce'],
      servings: 4,
      isVegetarian: false
    },
    {
      name: 'Vegetable Stir Fry',
      ingredients: ['broccoli', 'carrots', 'bell peppers', 'soy sauce'],
      servings: 2,
      isVegetarian: true
    }
  ]
}

describe('lastRecipe', function () {
  it('returns the title of the last recipe in the array', function () {
    const expectedTitle = 'Vegetable Stir Fry'
    assert.strictEqual(lastRecipe(recipeBook), expectedTitle)
  })

  it('returns undefined when there are no recipes', function () {
    const emptyRecipeBook = { title: 'Empty Recipe Book', recipes: [] }
    assert.strictEqual(lastRecipe(emptyRecipeBook), undefined)
  })

  it('returns the title when there is only one recipe', function () {
    const oneRecipeBook = {
      title: 'Single Recipe Book',
      recipes: [
        {
          name: 'Pancakes',
          ingredients: ['flour', 'milk', 'eggs'],
          servings: 4,
          isVegetarian: true
        }
      ]
    }
    const expectedTitle = 'Pancakes'
    assert.strictEqual(lastRecipe(oneRecipeBook), expectedTitle)
  })
})
