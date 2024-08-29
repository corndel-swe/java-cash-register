package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level3 {

  // Level 3

  /**
   * Calculates the total value of all money in the drawer Give the answer as a string formatted in
   * dollars, i.e. "$23.78" not 2378
   *
   * <p>Consider using the .toFixed() method: https://www.w3schools.com/jsref/jsref_tofixed.asp
   *
   * @param {List<Item>} - drawer
   * @returns {String} The amount of money in the drawer formatted in dollars
   */
  public static String sumDrawer(List<Item> drawer) {
    // code here
    // return null;

    int totalCents = drawer.stream().mapToInt(item -> item.getValue() * item.getQuantity()).sum();
    double totalDollars = totalCents / 100.0;
    return String.format("$%.2f", totalDollars);
  }
}
