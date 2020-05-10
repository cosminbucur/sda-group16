package com.sda.advanced.collections.stack;

import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {
        // CREATE
        // <> diamond operator
        Stack<Integer> stack = new Stack<>();
        // TODO: add items from array with for each
        System.out.println("empty? " + stack.empty());
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        System.out.println("empty? " + stack.empty());

        // READ
        stack.search(5);

        // DELETE

        // removes first item
        System.out.println("size " + stack.size());
        Integer firstItem = stack.pop();
        System.out.println("size " + stack.size());
        Integer firstPeekedItem = stack.peek();
        System.out.println("size " + stack.size());
    }
}
