package Rooms;

import Inventory.Item;
import Inventory.ItemRepository;
import Inventory.RoomTier;

public class Room { // single, double, suites, presidential_suites ...
    public RoomTier tier;
    public RoomType type;   // rate/size is inferred from RoomType
    public int room_id;
    public boolean isBooked;

    public ItemRepository items;

    public Room(int i, RoomType type, boolean isBooked) {
        this.room_id = i;
        this.type = type;
        this.isBooked = isBooked;
    }

    public RoomType getType() {
        return type;
    }

    public ItemRepository getItem() {return items;}

    public int getRoomID() {
        return room_id;
    }

    public boolean isBooked(){
        return isBooked;
    }

    public String getStatus(){
        if (isBooked){
            return "BOOKED";
        }
        return "EMPTY";
    }


}
    