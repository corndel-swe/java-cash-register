import { describe, it } from 'mocha'
import assert from 'assert'
import { removeItem, addItem } from '../lib/level-1.js'

describe('removeItem', function () {
  it('removes a penny', function () {
    const drawer = [{ name: 'penny', value: 1, quantity: 5 }]
    const testDrawer = removeItem('penny', drawer)
    const expectedDrawer = [{ name: 'penny', value: 1, quantity: 4 }]
    assert.deepStrictEqual(testDrawer, expectedDrawer)
  })
})

describe('addItem', function () {
  it('adds a penny', function () {
    const drawer = [{ name: 'penny', value: 1, quantity: 5 }]
    const testDrawer = addItem('penny', drawer)
    const expectedDrawer = [{ name: 'penny', value: 1, quantity: 6 }]
    assert.deepStrictEqual(testDrawer, expectedDrawer)
  })
})
