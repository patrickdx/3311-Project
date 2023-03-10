package Inventory;

import java.util.HashMap;
import java.util.Map;

public class RoomInventoryChecker {
    private Map<Item, Integer> requiredInventory;

    public RoomInventoryChecker() {
        this.requiredInventory = new HashMap<>();
    }

    public void addItemRequirement(Item item, int quantity) {
        requiredInventory.put(item, quantity);
    }

    public Map<Item, Integer> getSupplyNeeded(ItemRepository repo) {
        Map<Item, Integer> supplyNeeded = new HashMap<>();

        for (Item item : requiredInventory.keySet()) {
            int requiredQuantity = requiredInventory.get(item);
            int currentQuantity = repo.checkStock(item);

            if (currentQuantity < requiredQuantity) {
                supplyNeeded.put(item, requiredQuantity - currentQuantity);
            }
        }

        return supplyNeeded;
    }
}
