package com.sda.advanced.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        // CREATE
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);

        // READ
        numbers.contains(2);

        // UPDATE

        // DELETE
        numbers.remove(2);

        // print all elements from set
        printElements(numbers);
    }

    public static void printElements(Set<Integer> set) {
        for (Integer number : set) {
            System.out.print(number + ", ");
        }
    }
}
