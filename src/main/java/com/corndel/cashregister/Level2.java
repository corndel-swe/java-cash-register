package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level2 {

  // Level 2

  /**
   * Goes through the given drawer and counts how many *coins* there are in total N.b. just the
   * number of coins, not the total value of them N.b. $1 is a note, not a coin
   *
   * @param {List<Item>} drawer
   * @returns {int} How many coins are in the drawer
   */
  public static int countCoins(List<Item> drawer) {
    // code here
    // return 0;
    return drawer.stream()
        .filter(
            item ->
                item.getValue()
                    < 100) // Assuming coins have a value less than 100 (less than a dollar)
        .mapToInt(Item::getQuantity)
        .sum();
  }

  /**
   * Same as count coins but for *notes* instead
   *
   * @param {List<Item>} drawer
   * @returns {int} How many notes are in the drawer
   */
  public static int countNotes(List<Item> drawer) {
    // code here
    // return 0;

    return drawer.stream()
        .filter(
            item ->
                item.getValue()
                    >= 100) // Assuming notes have a value of 100 or more (a dollar or more)
        .mapToInt(Item::getQuantity)
        .sum();
  }
}
