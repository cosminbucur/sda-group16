package com.sda.advanced.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        createList();
        listOperations();
    }

    private static void listOperations() {
        // ADD ITEMS
        List<String> countries = new ArrayList<>();
        countries.add("England");
        countries.add("Spain");
        countries.add("Spain");
        countries.add("Korea");

        //  READ
        System.out.println(countries.get(1));
        System.out.println(countries.indexOf("Korea"));

        // UPDATE
        countries.add(0, "France");
        countries.set(0, "Italy");

        // DELETE
        String countryToDelete = "Korea";
        if (countries.contains(countryToDelete)) {
            countries.remove(countryToDelete);
        } else {
            throw new RuntimeException(countryToDelete + " is not in the list!");
        }
        System.out.println(countries.size());
        printElements(countries);
    }

    private static int countSpain(List<String> list) {
        int result = 0;
        for (String element : list) {
            if (element.equals("Spain")) {
                result++;
            }
        }
        return result;
    }

    private static void printElements(List<String> anyList) {
        for (String element : anyList) {
            System.out.println(element);
        }
    }

    private static void createList() {
        //        what is Iterable
        Iterable iterable;
        // what is Collection
        Collection collection;
//        what is List;
//        create list
        List<Integer> numbers = new ArrayList();
        numbers.add(2);
        numbers.add(5);
//      actions
        numbers.get(0);
        numbers.contains(3);
        numbers.isEmpty();
        numbers.remove(0);
    }
}
