import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AAA_Pattern {

    private List<String> listFixture;

    @BeforeEach
    public void setUp() {
        listFixture = new ArrayList<>();
        listFixture.add("java");
        listFixture.add("jUnit");
    }

    @AfterEach
    public void tearDown() {
        listFixture.clear();
        listFixture = null;
    }

    @Test
    public void testAddItemToList() {
        String newItem = "maven";
        int initialSize = listFixture.size();

        listFixture.add(newItem);

        assertEquals(initialSize + 1, listFixture.size(), "List size should increase by one");
        assertTrue(listFixture.contains("maven"), "list should contain  newly added item");
    }

    @Test
    public void testRemoveItemFromList() {
        String itemToRemove = "java";

        boolean wasRemoved = listFixture.remove(itemToRemove);

        assertTrue(wasRemoved, "item should be successfully removed");
        assertFalse(listFixture.contains("java"), "list should no longer contain 'Java'");
        assertEquals(1, listFixture.size(), "list size should be reduced to one");
    }
}