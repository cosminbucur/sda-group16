package com.sda.recap.functional;

public class DemoFunctional {

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface =
            (int someNumber, int secondNumber) -> {
                System.out.println("someNumber");
            };
    }
}
