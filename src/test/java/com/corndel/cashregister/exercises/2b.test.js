import { describe, it } from 'mocha'
import assert from 'assert'
import listNames from '../exercises/2b.js'

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

describe('listTitles', function () {
  it('returns the correct titles for the given recipes', function () {
    const expectedTitles = ['Spaghetti Bolognese', 'Vegetable Stir Fry']
    assert.deepStrictEqual(listNames(recipes), expectedTitles)
  })

  it('returns an empty array when there are no recipes', function () {
    const emptyRecipes = []
    assert.deepStrictEqual(listNames(emptyRecipes), [])
  })

  it('returns the correct titles when there is one recipe', function () {
    const oneRecipe = [
      {
        name: 'Pancakes',
        ingredients: ['flour', 'milk', 'eggs'],
        servings: 4,
        isVegetarian: true
      }
    ]
    const expectedTitles = ['Pancakes']
    assert.deepStrictEqual(listNames(oneRecipe), expectedTitles)
  })

  it('handles recipes with different properties', function () {
    const variedRecipes = [
      {
        name: 'Salad',
        ingredients: ['lettuce', 'tomatoes'],
        servings: 2,
        isVegetarian: true
      },
      {
        name: 'Steak',
        ingredients: ['beef', 'seasoning'],
        servings: 1,
        isVegetarian: false
      },
      {
        name: 'Soup',
        ingredients: ['broth', 'vegetables'],
        servings: 3,
        isVegetarian: true
      }
    ]
    const expectedTitles = ['Salad', 'Steak', 'Soup']
    assert.deepStrictEqual(listNames(variedRecipes), expectedTitles)
  })
})
