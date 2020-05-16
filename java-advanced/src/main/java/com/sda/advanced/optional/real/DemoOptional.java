package com.sda.advanced.optional.real;

import java.util.Optional;

public class DemoOptional {

    public static void main(String[] args) {
        Database database = new Database();

        // find cristi

        // not ok
        Optional<Person> optionalPerson = database.findPersonByName("cristi");
        if (optionalPerson.isPresent()) {
            Person cristi = optionalPerson.get();
            System.out.println(cristi);
        }

        // ok
        database.findPersonByName("cristi")
            .orElseThrow(() -> new RuntimeException("person not found"));
    }
}
