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

public class CountMoneyTest {

    // This method is analogous to the countCoins function in the original code.
    // It counts the total number of coins in the drawer.
    public int countCoins(List<Item> drawer) {
        return drawer.stream()
                     .filter(item -> item.value < 100) // Assuming coins have a value less than 100 (less than a dollar)
                     .mapToInt(item -> item.quantity)
                     .sum();
    }

    // This method is analogous to the countNotes function in the original code.
    // It counts the total number of notes in the drawer.
    public int countNotes(List<Item> drawer) {
        return drawer.stream()
                     .filter(item -> item.value >= 100) // Assuming notes have a value of 100 or more (a dollar or more)
                     .mapToInt(item -> item.quantity)
                     .sum();
    }

    @Test
    // Test to ensure the total number of coins is counted correctly
    void testCountCoins() {
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
        
        int expectedCoinCount = 161;
        // Check if the function correctly counts the total number of coins
        assertEquals(expectedCoinCount, countCoins(drawer));
    }

    @Test
    // Test to ensure the total number of notes is counted correctly
    void testCountNotes() {
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
        
        int expectedNoteCount = 107;
        // Check if the function correctly counts the total number of notes
        assertEquals(expectedNoteCount, countNotes(drawer));
    }
}
