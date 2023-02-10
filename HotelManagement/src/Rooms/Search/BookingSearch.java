package Rooms.Search;

import Rooms.Booking;
import Rooms.Search.PredicateSearch;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookingSearch extends PredicateSearch<Booking> {
    public BookingSearch(List<Booking> bookings){
        super(bookings);
    }

    public BookingSearch date(LocalDate date){
        Predicate<Booking> dateSearch = x -> x.getDateBooked() == date;
        addPredicate(dateSearch);
        return this;
    }

    public BookingSearch id(int id) {
        Predicate<Booking> idSearch = x -> x.getBookingID() == id;
        addPredicate(idSearch);
        return this;
    }



}
