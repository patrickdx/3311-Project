package Rooms;

import java.time.LocalDate;
import java.util.List;

public class rooooom {
    private List<Person> guests;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    public rooooom(List<Person> guests, LocalDate dateStart, LocalDate dateEnd){
        this.guests = guests;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString(){
        return guests.toString() + "From: " + dateStart.toString() + "To: " + dateEnd.toString();
    }

//    private something.Person findGuest(int customer_id){
//        for (something.Person i : guests){
//            if (i.getID() == customer_id) return i;
//        }
//        return null;
//    }


}
