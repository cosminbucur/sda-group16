package com.sda.advanced.functional.interfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("ana", "paul", "alex");

        printElementsEasier(names);
        printElementsEasiest(names);
    }

    // functional programming for each
    public static void printElementsEasier(List<String> list) {
        Consumer<String> printConsumer = (myString) -> {
            System.out.println(myString);
        };

        list.forEach(printConsumer);
    }

    // functional programming 1 line
    public static void printElementsEasiest(List<String> list) {
        // lambda for each
        list.forEach(item -> System.out.println(item));

        // method reference
        list.forEach(System.out::println);
    }
}
