package Rooms;

import something.Person;

public interface RoomInterface {
    void addGuest(Person person);
    void removeGuest(int cust_id);
    int getPrice();
    RoomType getType();
}
