import { describe, it } from 'mocha'
import assert from 'assert'
import recipeSummary from '../exercises/1a.js'

// Sample recipes for testing
const recipe1 = {
  name: 'Spaghetti Bolognese',
  ingredients: ['spaghetti', 'beef', 'tomato sauce'],
  servings: 4,
  isVegetarian: false
}

const recipe2 = {
  name: 'Vegetable Stir Fry',
  ingredients: ['broccoli', 'carrots', 'bell peppers', 'soy sauce'],
  servings: 2,
  isVegetarian: true
}

describe('recipeSummary', function () {
  it('returns the correct summary for Spaghetti Bolognese', function () {
    const expectedSummary =
      'Spaghetti Bolognese has 3 ingredients and serves 4 people'
    assert.strictEqual(recipeSummary(recipe1), expectedSummary)
  })

  it('returns the correct summary for Vegetable Stir Fry', function () {
    const expectedSummary =
      'Vegetable Stir Fry has 4 ingredients and serves 2 people'
    assert.strictEqual(recipeSummary(recipe2), expectedSummary)
  })
})
