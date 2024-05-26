package main.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class SILab2Test {

    @Test
    void testEveryBranch() {

        RuntimeException thrown = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertEquals("allItems list can't be null!", thrown.getMessage());
    }

    @Test
    void testMultipleCondition() {

        List<Item> items1 = List.of(new Item("item1", "01234", 350, 0.1f));
        assertFalse(SILab2.checkCart(items1, 315));
    }
}