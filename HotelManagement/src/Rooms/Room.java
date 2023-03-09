package Rooms;

public class Room { // single, double, suites, presidential_suites ...
    public RoomType type;   // rate/size is inferred from RoomType
    public int room_id;
    public boolean isBooked;

    public Room(int i, RoomType type, boolean isBooked) {
        this.room_id = i;
        this.type = type;
        this.isBooked = isBooked;
    }

    public RoomType getType() {
        return type;
    }

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
    