package com.sda.advanced.functional.interfaces.operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        // function = lambda
        UnaryOperator<Integer> unaryOperator = number -> number * number;
        useUnaryOperator(list, unaryOperator)   // list of transformed elements
            .forEach(integer -> System.out.println(integer));
    }

    private static List<Integer> useUnaryOperator(List<Integer> list, UnaryOperator<Integer> unaryOperator) {
        // create a new list with transformed values
        List<Integer> uniList = new ArrayList<>();

        // iterate list
        // apply operator
        // add to new list

        // consumer: input -> no output
        list.forEach(element -> uniList.add(unaryOperator.apply(element)));

        return uniList;
    }
}
