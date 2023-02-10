package Rooms;

import java.time.LocalDate;
import Requests.Request;
import java.util.List;

public class Booking  {

    private int booking_id;
    public List<Person> guests;
    public List<Request> requests;
    public LocalDate dateBooked;
    public Room roomBooked;

    public Booking(Room room, List<Person> guests, LocalDate date){
        this.roomBooked = room;
        this.guests = guests;
        this.dateBooked = date;
    }

    public void addGuest(Person person){
        guests.add(person);
    }
    
    public void addRequest(String message, List<Request> allRequests){
    	Request r = new Request(message, this);
    	requests.add(r);
        allRequests.add(r);
    }
    public void addRequest(String message, float cost, List<Request> allRequests){
    	Request r = new Request(message, cost, this);
    	requests.add(r);
        allRequests.add(r);
    }

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
    
    public List<Request> getRequests() {
    	return requests;
    }

    public LocalDate getDateBooked(){return this.dateBooked;}
}
