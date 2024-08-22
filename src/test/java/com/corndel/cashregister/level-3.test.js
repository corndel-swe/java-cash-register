import { describe, it } from 'mocha'
import assert from 'assert'
import { sumDrawer } from '../lib/level-3.js'

const drawer = [
  { name: 'hundred', value: 10000, quantity: 1 },
  { name: 'twenty', value: 2000, quantity: 3 },
  { name: 'ten', value: 1000, quantity: 2 },
  { name: 'five', value: 500, quantity: 11 },
  { name: 'one', value: 100, quantity: 90 },
  { name: 'quarter', value: 25, quantity: 17 },
  { name: 'dime', value: 10, quantity: 31 },
  { name: 'nickel', value: 5, quantity: 41 },
  { name: 'penny', value: 1, quantity: 72 }
]

describe('sumDrawer', function () {
  it('sums the drawer', function () {
    assert.strictEqual(sumDrawer(drawer), '$335.12')
  })
})
