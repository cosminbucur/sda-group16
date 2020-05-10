package com.sda.advanced.collections.list;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        // CREATE
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        // READ
        numbers.get(2);

        // UPDATE
        numbers.set(2, 4);

        // DELETE
        numbers.remove(1);
        // 1 4
    }
}
