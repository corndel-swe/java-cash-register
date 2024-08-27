import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

// Class representing an Item in the drawer (either a coin or a note)
class Item {
    String name;
    int value;
    int quantity;

    Item(String name, int value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    // Overriding equals to allow object comparison in tests
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Item item = (Item) obj;

        if (value != item.value) return false;
        return quantity == item.quantity && name.equals(item.name);
    }
}

public class TransactionTest {

    // This method simulates the transaction function.
    // It adjusts the drawer based on the payment made and the cost of the item.
    public List<Item> transaction(int cost, int paid, List<Item> drawer) {
        int change = paid - cost;

        // Start with the largest denomination and work downwards
        for (Item item : drawer) {
            while (change >= item.value && item.quantity > 0) {
                change -= item.value;
                item.quantity--;
            }
        }

        // Add the paid amount to the drawer
        for (Item item : drawer) {
            if (item.value == paid) {
                item.quantity++;
                break;
            }
        }

        return drawer;
    }

    @Test
    // Test to ensure the drawer is correctly adjusted after a transaction
    void testTransaction() {
        int cost = 450;
        int paid = 1000;

        List<Item> drawer = new ArrayList<>();
        drawer.add(new Item("ten", 1000, 1));
        drawer.add(new Item("five", 500, 1));
        drawer.add(new Item("one", 100, 2));
        drawer.add(new Item("quarter", 25, 3));
        drawer.add(new Item("dime", 10, 0));
        drawer.add(new Item("nickel", 5, 0));
        drawer.add(new Item("penny", 1, 2));

        List<Item> expectedDrawer = new ArrayList<>();
        expectedDrawer.add(new Item("ten", 1000, 2));
        expectedDrawer.add(new Item("five", 500, 0));
        expectedDrawer.add(new Item("one", 100, 2));
        expectedDrawer.add(new Item("quarter", 25, 1));
        expectedDrawer.add(new Item("dime", 10, 0));
        expectedDrawer.add(new Item("nickel", 5, 0));
        expectedDrawer.add(new Item("penny", 1, 2));

        List<Item> testDrawer = transaction(cost, paid, drawer);
        // Check if the drawer is correctly adjusted
        assertEquals(expectedDrawer, testDrawer);
    }
}
