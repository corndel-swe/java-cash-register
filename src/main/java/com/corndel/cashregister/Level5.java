package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level5 {

  // Level 5

  /**
   * Works out the amount of change the customer is owed based on the cost of
   * their items and the
   * amount they have paid. Adds the customer"s paid amount to the drawer, removes
   * their change from
   * the drawer, then returns the new drawer.
   *
   * <p>
   * N.b. assume that the paid amount and the change are given in the largest
   * denominations
   * available, i.e. 2.25 should be 2 dollar bills and 1 quarter (if
   * available)rather than 2 dollar
   * bills and 5 nickels (however if no quarters and dimes are available you will
   * use nickels, etc)
   *
   * <p>
   * E.g. (14, 20, drawer) adds 1 twenty to the drawer, and removes 1 five and 1
   * one from the
   * drawer to give to customer as change
   *
   * @param {int}        cost - the cost of the customer's basket
   * @param {int}        paid - the amount of cash they hand the cashier
   * @param {List<Item>} drawer
   * @returns {List<Item>} the drawer, after the transaction has taken place
   */
  public static List<Item> transaction(int cost, int paid, List<Item> drawer) {
    // code here
    return null;
  }
}
