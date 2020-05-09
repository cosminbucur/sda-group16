package com.sda.advanced.collections.generics;

public class DemoGenerics {

    public static void main(String[] args) {
        Car car = new Car();
        GenericBox<Car> genericBox = new GenericBox(car);
        System.out.println(genericBox.getItem());
        GenericBox<String> genericBoxWithStrings = new GenericBox("hello");
        System.out.println(genericBoxWithStrings.getItem());

    }

    public static void whyGenerics() {
        Object[] myArray = new Object[3];
        myArray[0] = "hello";
        myArray[1] = new Car();
        myArray[2] = "hi";
    }
}
