package Rooms.Search;

import Rooms.Booking;
import Rooms.Room;
import Rooms.RoomType;

import java.util.List;
import java.util.function.Predicate;

public class RoomSearch extends PredicateSearch<Room> {
    public RoomSearch(List<Room> rooms){
        super(rooms);
    }

    public RoomSearch roomID(int id){
        Predicate<Room> xd = x -> id == x.getRoomID();
        totalPredicate = totalPredicate.and(xd);
        return this;
    }

    public RoomSearch roomType(RoomType type){
        Predicate<Room> xd = x -> type == x.getType();
        totalPredicate = totalPredicate.and(xd);
        return this;
    }



}
