package controller;

import Inventory.Item;
import Inventory.ItemRepository;
import Inventory.RoomInventoryChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Map;

public class RoomInventoryController {
    private RoomInventoryChecker requiredInventory;

    public RoomInventoryController(RoomInventoryChecker requiredInventory) {
        this.requiredInventory = requiredInventory;
    }
    JLabel itemLabel = new JLabel("Item:");


    JComboBox<Item> itemComboBox = new JComboBox<>(Item.values());


    JLabel quantityLabel = new JLabel("Quantity:");


    JTextField quantityTextField = new JTextField();


    JButton addButton = new JButton("Add Requirement");




    JButton checkButton = new JButton("Check Inventory");



    public void displayResupplyInfo() {
        Map<Item, Integer> resupply = requiredInventory.getSupplyNeeded(new ItemRepository());
        if (resupply.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No items need to be resupplied.");
        } else {
            StringBuilder message = new StringBuilder();
            for (Item item : resupply.keySet()) {
                int resupplyAmount = resupply.get(item);
                message.append(String.format("%s: %d\n", item.name(), resupplyAmount));
            }
            JOptionPane.showMessageDialog(null, message.toString(), "Resupply Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
