import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

// Class representing a Recipe Book
class RecipeBook {
    String title;
    List<String> recipes;

    RecipeBook(String title, List<String> recipes) {
        this.title = title;
        this.recipes = recipes;
    }

    // Overriding equals to allow object comparison in tests
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        RecipeBook that = (RecipeBook) obj;

        if (!title.equals(that.title)) return false;
        return recipes.equals(that.recipes);
    }
}

public class RenameBookTest {

    // This method is analogous to the renameBook function in the original code.
    // It renames the recipe book and returns the modified book.
    public RecipeBook renameBook(RecipeBook book, String newTitle) {
        return new RecipeBook(newTitle, book.recipes);
    }

    @Test
    // Test for renaming the recipe book
    void testRenameBook() {
        RecipeBook recipeBook = new RecipeBook("My Recipe Book", new ArrayList<>());

        String newName = "Good Eats";
        RecipeBook expectedBook = new RecipeBook(newName, new ArrayList<>());

        // Check if the book is renamed correctly
        assertEquals(expectedBook, renameBook(recipeBook, newName));
    }
}
