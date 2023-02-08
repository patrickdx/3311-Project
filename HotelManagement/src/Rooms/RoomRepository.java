package Rooms;

import Rooms.Search.BookingSearch;
import Rooms.Search.RoomSearch;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomRepository {
    static List<Room> rooms = new ArrayList<>();   // collection of total rooms
   static  List<Booking> clients = new ArrayList<>();  // total clients

    public static void main (String args[]){
        Room room = new Room(24, RoomType.SINGLE);
        rooms.add(room);
        RoomSearch xd = new RoomSearch(rooms);

        System.out.println(room.getRoomID());
        System.out.println(xd.roomID(24).roomType(RoomType.SINGLE).search());


    }
}
