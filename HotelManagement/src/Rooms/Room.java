package Rooms;

import something.Person;
import java.time.LocalDate;
import java.util.List;

public class Room { // single, double, suites, presidential_suites ...
    public RoomType type;   // rate/size is inferred from RoomType
    public int room_id;
    private Booking booking;

    public Room(RoomType type, Booking booking){
        this.type = type;
        this.booking = booking;
    }

    public Room(RoomType type){
        this.type = type;
    }

    public RoomType getType() {
        return type;
    }

    public int getRoomID() {
        return room_id;
    }
}
    