package com.sda.advanced.functional.interfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicate {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Cristi", "Alex");

        printOldSchool(names);
        printNewSchool(names);
    }

    private static void printOldSchool(List<String> names) {
        List<String> filteredList = filterList(names);
        // print using lambda
        filteredList.forEach(name -> System.out.println(name));
    }

    private static void printNewSchool(List<String> names) {
        // filter using predicate
        Predicate<String> startsWithAPredicate = (name) -> name.startsWith("A");

        List<String> filteredNames = names.stream()         // transform list to stream
            .filter((name) -> name.startsWith("A"))         // filter all names starting with "A"
            .collect(Collectors.toList());                  // save filtered result into a new list
        filteredNames.forEach(name -> System.out.println(name));    // print all filtered names
    }

    // filter list of names beginning with A
    private static List<String> filterList(List<String> list) {
        List<String> filteredList = new ArrayList<>();
        // iterate list
        for (String element : list) {
            // check if starts with A
            if (element.startsWith("A")) {
                // add to a new list
                filteredList.add(element);
            }
        }

        // return a new list
        return filteredList;
    }
}
