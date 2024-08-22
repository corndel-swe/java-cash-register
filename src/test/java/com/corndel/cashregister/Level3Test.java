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

public class SumDrawerTest {

    // This method is analogous to the sumDrawer function in the original code.
    // It calculates the total value of all items in the drawer and returns it as a formatted string.
    public String sumDrawer(List<Item> drawer) {
        int totalCents = drawer.stream()
                               .mapToInt(item -> item.value * item.quantity)
                               .sum();
        double totalDollars = totalCents / 100.0;
        return String.format("$%.2f", totalDollars);
    }

    @Test
    // Test to ensure the total value of the drawer is correctly calculated and formatted
    void testSumDrawer() {
        List<Item> drawer = new ArrayList<>();
        drawer.add(new Item("hundred", 10000, 1));
        drawer.add(new Item("twenty", 2000, 3));
        drawer.add(new Item("ten", 1000, 2));
        drawer.add(new Item("five", 500, 11));
        drawer.add(new Item("one", 100, 90));
        drawer.add(new Item("quarter", 25, 17));
        drawer.add(new Item("dime", 10, 31));
        drawer.add(new Item("nickel", 5, 41));
        drawer.add(new Item("penny", 1, 72));
        
        String expectedSum = "$335.12";
        // Check if the function returns the correct sum of the drawer
        assertEquals(expectedSum, sumDrawer(drawer));
    }
}
