package Rooms.Search;

import Rooms.Booking;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateSearch<T> {
    public List<T> repository;
    public Predicate totalPredicate;

    public PredicateSearch(List<T> repository){
        this.totalPredicate = (x) -> {return true;};
        this.repository = repository;
    }

    public void addPredicate(Predicate<T> toAdd){
        totalPredicate = totalPredicate.and(toAdd);
    }

    // streams the collection and filters based on totalPredicate criteria.
    public List<T> search() {
        return (List<T>) this.repository.stream().filter(totalPredicate).collect(Collectors.toList());
    }
}
