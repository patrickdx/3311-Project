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

    public void date(LocalDate date){
        Predicate<Booking> dateSearch = x -> x.getDateBooked() == date;
        totalPredicate.and(dateSearch);
    }

}
