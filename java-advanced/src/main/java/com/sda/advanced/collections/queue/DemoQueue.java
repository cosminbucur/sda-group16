package com.sda.advanced.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {

    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();

        // CREATE
        names.add("alex");     // enqueue
        names.add("ana");
        names.add("paul");

        // READ
        printElements(names);
        String firstItemPeeked = names.peek();   // alex
        System.out.println();
        System.out.println(firstItemPeeked);
        printElements(names);

        // UPDATE

        // DELETE
        String firstItemPolled = names.poll();  // deque
        System.out.println();
        printElements(names);
    }

    private static void printElements(Queue<String> queue) {
        for (String element : queue) {
            System.out.printf(element + " ");
        }
    }
}
