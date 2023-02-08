package Rooms;

import something.Person;

import java.time.LocalDate;
import java.util.List;

public class Booking implements RoomInterface {

    private int booking_id;
    public List<Person> guests;
    public LocalDate dateBooked;
    public Room roomBooked;

    public Booking(Room room, List<Person> guests, LocalDate date){
        this.roomBooked = room;
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

    public void extendDate(int days){
        dateBooked = dateBooked.plusDays(days);
    }

    public Room getRoom(){
        return this.roomBooked;
    }

    public int getBookingID(){
        return this.booking_id;
    }

    public LocalDate getDateBooked(){return this.dateBooked;}
}
