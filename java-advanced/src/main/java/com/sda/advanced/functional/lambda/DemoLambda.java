package com.sda.advanced.functional.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoLambda {

    public static void main(String[] args) {
        // lambda expression
        Consumer consumer = (param1) -> System.out.println("hello");

        List<String> names = Arrays.asList("ana", "paul", "alex");
        names.forEach(name -> System.out.println(name));

        printElements(names);
    }

    // regular for each
    public static void printElements(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // regular method
    public void method(String param1, String param2) {
        System.out.println("hello");
    }


}
