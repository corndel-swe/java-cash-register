package com.corndel.cashregister;

import static com.corndel.cashregister.Level5.transaction;
import static org.assertj.core.api.Assertions.assertThat;

import com.corndel.cashregister.models.Item;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Level5Test {
  @Test
  // Test to ensure the drawer is correctly adjusted after a transaction
  void testTransaction() {
    int cost = 450;
    int paid = 1000;

    List<Item> drawer = List.of(
        new Item("ten", 1000, 1),
        new Item("five", 500, 1),
        new Item("one", 100, 2),
        new Item("quarter", 25, 3),
        new Item("dime", 10, 0),
        new Item("nickel", 5, 0),
        new Item("penny", 1, 2));

    List<Item> expectedDrawer = List.of(
        new Item("ten", 1000, 2),
        new Item("five", 500, 0),
        new Item("one", 100, 2),
        new Item("quarter", 25, 1),
        new Item("dime", 10, 0),
        new Item("nickel", 5, 0),
        new Item("penny", 1, 2));

    List<Item> testDrawer = transaction(cost, paid, drawer);
    // Check if the drawer is correctly adjusted
    assertThat(testDrawer).usingRecursiveComparison().isEqualTo(expectedDrawer);
  }
}
