package Rooms;

import something.Person;
import java.time.LocalDate;
import java.util.List;

public class Room implements RoomInterface { // single, double, suites, presidential_suites ...
    public RoomType type;   // rate/size is inferred from RoomType
    public int room_id;
    public List<Person> guests;
    public int serviceLevel; // maybe higher priced suites have access to more luxurious services...
    public LocalDate dateBooked;

    public Room(RoomType type, List<Person> guests, LocalDate date){
        this.type = type;
        this.guests = guests;
        this.dateBooked = date;
    }

    @Override
    public void addGuest(Person person){
        guests.add(person);
    }

    @Override
    public void removeGuest(int customer_id) {
        for (Person i : guests){
            if (i.getID() == customer_id) guests.remove(i);
            break;
        }
    }

    @Override
    public int getPrice() {
        // return # of days * rate
        return 0;
    }

    @Override
    public RoomType getType() {
        return type;
    }
}
    