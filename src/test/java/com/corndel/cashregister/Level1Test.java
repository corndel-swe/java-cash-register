import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Class representing an Item in the drawer
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
        if (quantity != item.quantity) return false;
        return name.equals(item.name);
    }
}

public class DrawerTest {

    // This method is analogous to the removeItem function in the original code.
    // It removes one item from the drawer by decreasing its quantity.
    public List<Item> removeItem(String itemName, List<Item> drawer) {
        for (Item item : drawer) {
            if (item.name.equals(itemName) && item.quantity > 0) {
                item.quantity--;
            }
        }
        return drawer;
    }

    // This method is analogous to the addItem function in the original code.
    // It adds one item to the drawer by increasing its quantity.
    public List<Item> addItem(String itemName, List<Item> drawer) {
        for (Item item : drawer) {
            if (item.name.equals(itemName)) {
                item.quantity++;
            }
        }
        return drawer;
    }

    @Test
    // Test to ensure the quantity of a penny is reduced by 1
    void testRemoveItem() {
        List<Item> drawer = new ArrayList<>();
        drawer.add(new Item("penny", 1, 5));
        
        List<Item> testDrawer = removeItem("penny", drawer);
        List<Item> expectedDrawer = new ArrayList<>();
        expectedDrawer.add(new Item("penny", 1, 4));
        
        // Check if the function correctly removes an item
        assertEquals(expectedDrawer, testDrawer);
    }

    @Test
    // Test to ensure the quantity of a penny is increased by 1
    void testAddItem() {
        List<Item> drawer = new ArrayList<>();
        drawer.add(new Item("penny", 1, 5));
        
        List<Item> testDrawer = addItem("penny", drawer);
        List<Item> expectedDrawer = new ArrayList<>();
        expectedDrawer.add(new Item("penny", 1, 6));
        
        // Check if the function correctly adds an item
        assertEquals(expectedDrawer, testDrawer);
    }
}
