package Inventory;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {
    private Map<Item, Integer> inv;

    public ItemRepository(){
        inv = new HashMap<>();
    }

    // in case of importing an existing inventory
    public ItemRepository(Map<Item, Integer> inventory){
        this.inv = inventory;
    }
    public int checkStock(Item item){
        if (inv.containsKey(item)) return inv.get(item);
        return 0;
    }

    public void viewItems(){
        for (Item i : inv.keySet()){
            System.out.println(String.format("%s,%s", i, inv.get(i)));
        }

    }

 //increasing items in inventory
    public void addStockToInventory(Item item, int qty){
        inv.replace(item, checkStock(item)+qty);
    }
    //decreasing items from inventory
    public void removeFromStockInventory(Item item, int qty){
        inv.replace(item, checkStock(item)-qty);
    }
}
