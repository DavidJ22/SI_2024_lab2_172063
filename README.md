# SI_2024_lab2_172063
David Janev 172063
![Untitled Diagram drawio](https://github.com/DavidJ22/SI_2024_lab2_172063/assets/70535307/db0433b5-11b1-428d-ab1c-da75b38972b6)
Kompleksnosta na kodot e presmetano so V(G) = E - N + 2P 
N = 22
E = 25
P = 1
V(G) = 25 - 22 + 2 X 1 = 5

Kompleksnosta e 5, do resenieto stignav so pomos na google.


    void testEveryBranch() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertEquals("allItems list can't be null!", thrown.getMessage());

        List<Item> items2 = List.of(new Item("item1", "12345", 100, 0), new Item("item2", "67890", 200, 0));
        assertTrue(SILab2.checkCart(items2, 300));

        List<Item> items3 = List.of(new Item(null, "12345", 100, 0), new Item("item2", "67890", 200, 0));
        assertFalse(SILab2.checkCart(items3, 250));

        List<Item> items4 = List.of(new Item("item1", null, 100, 0));
        RuntimeException thrown2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items4, 100));
        assertEquals("No barcode!", thrown2.getMessage());

        List<Item> items5 = List.of(new Item("item1", "123a5", 100, 0));
        RuntimeException thrown3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items5, 100));
        assertEquals("Invalid character in item barcode!", thrown3.getMessage());
    }
}

void testMultipleCondition() {
        List<Item> items1 = List.of(new Item("item1", "01234", 350, 0.1f));
        assertFalse(SILab2.checkCart(items1, 315)); 

        List<Item> items2 = List.of(new Item("item1", "01234", 250, 0.1f));
        assertFalse(SILab2.checkCart(items2, 250)); 

        List<Item> items3 = List.of(new Item("item1", "01234", 350, 0));
        assertFalse(SILab2.checkCart(items3, 350)); 

        List<Item> items4 = List.of(new Item("item1", "11234", 350, 0.1f));
        assertFalse(SILab2.checkCart(items4, 315)); 
    }
}

