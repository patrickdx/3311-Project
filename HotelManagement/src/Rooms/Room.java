package Rooms;

public class Room { // single, double, suites, presidential_suites ...
    public RoomType type;   // rate/size is inferred from RoomType
    public int room_id;

    public Room(int i, RoomType type){
        this.room_id = i;
        this.type = type;
    }
    public RoomType getType() {
        return type;
    }

    public int getRoomID() {
        return room_id;
    }
}
    