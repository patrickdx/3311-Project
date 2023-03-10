package Inventory;

import java.util.List;

public enum RoomTier {
    TIER_1(List.of(Item.SOAP, Item.TOWEL)), TIER_2(List.of(Item.SOAP, Item.TOWEL, Item.SLIPPERS)), TIER_3(List.of(Item.SOAP, Item.TOWEL, Item.SLIPPERS, Item.CHAMPAGNE));

    public List<Item> amenities;

    RoomTier(List<Item> amenities){
        this.amenities = amenities;
    }

}
