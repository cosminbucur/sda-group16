package com.sda.advanced.functional.interfaces;

public class DemoFunctionalInterface {

    public static void main(String[] args) {
        MyFunctionalInterface functionObject =
            (int someNumber) -> {
                System.out.println(someNumber);
            };
    }
}
