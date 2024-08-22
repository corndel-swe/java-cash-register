import { describe, it } from 'mocha'
import assert from 'assert'
import { canMakeAmount } from '../lib/level-4.js'

describe('canMakeAmount', function () {
  const drawer = [
    { name: 'ten', value: 1000, quantity: 1 },
    { name: 'five', value: 500, quantity: 1 },
    { name: 'one', value: 100, quantity: 2 },
    { name: 'quarter', value: 25, quantity: 3 },
    { name: 'dime', value: 10, quantity: 0 },
    { name: 'nickel', value: 5, quantity: 0 },
    { name: 'penny', value: 1, quantity: 2 }
  ]

  it('returns false when the amount cannot be made', function () {
    assert.strictEqual(canMakeAmount(613, drawer), false)
  })

  it('returns true when the amount can be made', function () {
    const drawer = [
      { name: 'ten', value: 1000, quantity: 1 },
      { name: 'five', value: 500, quantity: 1 },
      { name: 'one', value: 100, quantity: 2 },
      { name: 'quarter', value: 25, quantity: 3 },
      { name: 'dime', value: 10, quantity: 0 },
      { name: 'nickel', value: 5, quantity: 0 },
      { name: 'penny', value: 1, quantity: 2 }
    ]
    assert.strictEqual(canMakeAmount(1651, drawer), true)
  })
})
