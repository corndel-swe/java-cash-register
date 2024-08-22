import { describe, it } from 'mocha'
import assert from 'assert'
import countServings from '../exercises/3b.js'

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

describe('countServings', function () {
  it('returns the total number of servings in the book', function () {
    const expectedServings = 6
    assert.strictEqual(countServings(recipeBook), expectedServings)
  })

  it('returns 0 when there are no recipes', function () {
    const emptyRecipeBook = { title: 'Empty Recipe Book', recipes: [] }
    assert.strictEqual(countServings(emptyRecipeBook), 0)
  })

  it('returns the correct number of servings when there is only one recipe', function () {
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
    const expectedServings = 4
    assert.strictEqual(countServings(oneRecipeBook), expectedServings)
  })

  it('returns the correct number of servings with multiple recipes', function () {
    const multipleRecipesBook = {
      title: 'Multiple Recipes Book',
      recipes: [
        {
          name: 'Salad',
          ingredients: ['lettuce', 'tomatoes'],
          servings: 2,
          isVegetarian: true
        },
        {
          name: 'Steak',
          ingredients: ['beef', 'seasoning'],
          servings: 3,
          isVegetarian: false
        },
        {
          name: 'Soup',
          ingredients: ['broth', 'vegetables'],
          servings: 4,
          isVegetarian: true
        }
      ]
    }
    const expectedServings = 9
    assert.strictEqual(countServings(multipleRecipesBook), expectedServings)
  })
})
