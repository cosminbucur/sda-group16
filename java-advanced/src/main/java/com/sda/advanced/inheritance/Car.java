package com.sda.advanced.inheritance;

// INHERITANCE - IS A
// child
public class Car extends Vehicle {

    private boolean convertible;

    // 1. default constructor
    // parent constructor must be first
    public Car() {
        super();
        System.out.println("building child");
    }

    // 2. custom constructor
    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);    // Vehicle(maxSpeed)
        this.convertible = convertible;
    }
}
