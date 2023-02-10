package Rooms.Search;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * Serves as a base class for any object wanting to implement filter criteria based on their fields.
 */
public abstract class PredicateSearch<T> {
    public List<T> repository;
    public Predicate totalPredicate;

    public PredicateSearch(List<T> repository){
        this.totalPredicate = (x) -> {return true;};
        this.repository = repository;
    }

    public void addPredicate(Predicate<T> toAdd){
        totalPredicate = totalPredicate.and(toAdd);
    }


    // A complete predicate is built and passed into this method, which applies the filter upon the entire repository.
    public List<T> search() {
        return (List<T>) this.repository.stream().filter(totalPredicate).collect(Collectors.toList());
    }
}
