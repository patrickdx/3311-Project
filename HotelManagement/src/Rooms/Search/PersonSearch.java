package Rooms.Search;

import something.Person;

import java.util.List;
import java.util.function.Predicate;

public class PersonSearch extends PredicateSearch<Person>{

    public PersonSearch(List<Person> repository) {
        super(repository);
    }

    public PersonSearch name(String name){
        Predicate<Person> xd = x -> x.getName().equals(name);
        addPredicate(xd);
        return this;
    }

    public PersonSearch age (int age){
        Predicate<Person> xd = x -> x.getAge() == age;
        addPredicate(xd);
        return this;
    }
}
