package com.sda.advanced.optional.real;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {

    private List<Person> people = new ArrayList<>();

    // populate database
    public Database() {
        this.people.add(new Person("alex"));
        this.people.add(new Person("ana"));
    }

    // find person by name
    public Optional<Person> findPersonByName(String name) {
        // iterate list
        // filter
        // return if found
        return this.people.stream()    // Stream<Person>
            .filter(person -> person.getName().equals(name))
            .findAny();
    }
}
