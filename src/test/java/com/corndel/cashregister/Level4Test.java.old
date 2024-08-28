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
}

public class CanMakeAmountTest {

    // This method is analogous to the canMakeAmount function in the original code.
    // It checks if the exact amount can be made using the items in the drawer.
    public boolean canMakeAmount(int amount, List<Item> drawer) {
        for (Item item : drawer) {
            int itemTotalValue = item.value * item.quantity;
            if (itemTotalValue <= amount) {
                amount -= itemTotalValue;
            } else {
                amount -= (amount / item.value) * item.value;
            }
        }
        return amount == 0;
    }

    @Test
    // Test to ensure the function returns false when the amount cannot be made
    void testCannotMakeAmount() {
        List<Item> drawer = new ArrayList<>();
        drawer.add(new Item("ten", 1000, 1));
        drawer.add(new Item("five", 500, 1));
        drawer.add(new Item("one", 100, 2));
        drawer.add(new Item("quarter", 25, 3));
        drawer.add(new Item("dime", 10, 0));
        drawer.add(new Item("nickel", 5, 0));
        drawer.add(new Item("penny", 1, 2));
        
        // Check if the function returns false when the amount cannot be made
        assertEquals(false, canMakeAmount(613, drawer));
    }

    @Test
    // Test to ensure the function returns true when the amount can be made
    void testCanMakeAmount() {
        List<Item> drawer = new ArrayList<>();
        drawer.add(new Item("ten", 1000, 1));
        drawer.add(new Item("five", 500, 1));
        drawer.add(new Item("one", 100, 2));
        drawer.add(new Item("quarter", 25, 3));
        drawer.add(new Item("dime", 10, 0));
        drawer.add(new Item("nickel", 5, 0));
        drawer.add(new Item("penny", 1, 2));
        
        // Check if the function returns true when the amount can be made
        assertEquals(true, canMakeAmount(1651, drawer));
    }
}
