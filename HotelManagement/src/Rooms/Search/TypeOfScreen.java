package Rooms.Search;

import Rooms.Booking;
import Rooms.Room;
import Rooms.RoomType;

import java.util.List;
import java.util.function.Predicate;

public enum TypeOfScreen {
    
    
    MAIN_MENU_SCREEN(0),
    ROOM_SCREEN(1),
    CUSTOMER_SCREEN(2),
    REGISTER_SCREEN(3);


    private int number;


    TypeOfScreen(int number)
        {
        this.number=number;
    }

    public int getNumber(){
        return number;
    }


}
