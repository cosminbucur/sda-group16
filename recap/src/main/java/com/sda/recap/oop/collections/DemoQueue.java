package com.sda.recap.oop.collections;

import com.sda.recap.oop.generics.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new PriorityQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.remove();
        myQueue.peek();

        Map<Integer, Item> map = new HashMap<>();
        map.put(1, new Item());
        map.put(2, new Item());
        map.put(3, new Item());

        // all keys from map
        map.keySet();

        map.values();

        map.forEach((key, value) -> System.out.println(key + "-" + value));
    }
}
