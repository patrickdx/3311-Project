package test;
import Inventory.Item;
import Inventory.ItemRepository;
import Inventory.RoomInventoryChecker;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class ItemRepositoryTest {
    private ItemRepository repo;
    private RoomInventoryChecker checker;

    @BeforeAll
    public void init(){
        Map<Item, Integer> inv = new HashMap<>();
        inv.put(Item.LOTION, 4);
        inv.put(Item.SLIPPERS, 5);
        inv.put(Item.SOAP, 3);
        repo = new ItemRepository(inv);
    }

    @Test
    void testItemQuantity(){
        int quantity = repo.checkStock(Item.SOAP);
        assertEquals(3, quantity);
    }

    @Test
    void testOutOfStock(){
        assertEquals(0, repo.checkStock(Item.TOWEL));
    }

    @Test
    void testSupplyNeeded() {
        Map<Item, Integer> supplyNeeded = checker.getSupplyNeeded(repo);

        assertTrue(supplyNeeded.containsKey(Item.LOTION));
        assertEquals(2, (int) supplyNeeded.get(Item.LOTION));

        assertTrue(supplyNeeded.containsKey(Item.SLIPPERS));
        assertEquals(1, (int) supplyNeeded.get(Item.SLIPPERS));

        assertTrue(supplyNeeded.containsKey(Item.SOAP));
        assertEquals(1, (int) supplyNeeded.get(Item.SOAP));
    }

}
