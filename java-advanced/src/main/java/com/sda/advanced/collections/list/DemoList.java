package com.sda.advanced.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        // what is Iterable
        Iterable iterable;

        // what is Collection
        Collection collection;

        // what is List
        // create list
        List<Integer> numbers = new ArrayList();
        numbers.add(2);
        numbers.add(5);

        // actions
        numbers.get(0);
        numbers.contains(3);
        numbers.isEmpty();
        numbers.remove(0);
    }
}
