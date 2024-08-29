package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level1 {

  // Level 1

  /**
   * Goes into the given drawer and removes 1 item with the given name. E.g. ("penny", drawer)
   * removes 1 penny from the given drawer.
   *
   * @param {String} name - the name of the currency to remove
   * @param {List<Item>} drawer - the drawer of currency
   * @returns {List<Item>} - the drawer, after removing the item
   */
  public static List<Item> removeItem(String name, List<Item> drawer) {
    // code here
    return null;
  }

  /**
   * The same as removeItem but adds an item of currency instead
   *
   * @param {String} name
   * @param {List<Item>} drawer
   * @returns {List<Item>}
   */
  public static List<Item> addItem(String name, List<Item> drawer) {
    // code here
    return null;
  }

  public static void main(String[] args) {
    removeItem("penny", Drawer.drawer);
    System.out.println(Drawer.drawer.getLast().getValue());
  }
}
