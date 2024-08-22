import { describe, it } from 'mocha'
import assert from 'assert'
import countVeggies from '../exercises/2a.js'

// Sample array of recipes for testing
const recipes = [
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

describe('countVeggies', function () {
  it('returns the correct number of vegetarian recipes', function () {
    const vegetarianRecipes = recipes.filter(recipe => recipe.isVegetarian)
    assert.strictEqual(countVeggies(recipes), vegetarianRecipes.length)
  })

  it('returns 0 when there are no vegetarian recipes', function () {
    const novegetarianRecipes = [
      {
        name: 'Chicken Curry',
        ingredients: ['chicken', 'curry sauce'],
        servings: 4,
        isVegetarian: false
      },
      {
        name: 'Beef Stew',
        ingredients: ['beef', 'potatoes'],
        servings: 6,
        isVegetarian: false
      }
    ]
    assert.strictEqual(countVeggies(novegetarianRecipes), 0)
  })

  it('returns the correct number when all recipes are vegetarian', function () {
    const allvegetarianRecipes = [
      {
        name: 'vegetarian Salad',
        ingredients: ['lettuce', 'tomatoes'],
        servings: 2,
        isVegetarian: true
      },
      {
        name: 'vegetarian Burger',
        ingredients: ['bun', 'veggie patty'],
        servings: 1,
        isVegetarian: true
      }
    ]
    assert.strictEqual(
      countVeggies(allvegetarianRecipes),
      allvegetarianRecipes.length
    )
  })

  it('handles an empty list of recipes', function () {
    const emptyRecipes = []
    assert.strictEqual(countVeggies(emptyRecipes), 0)
  })
})
