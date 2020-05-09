package com.sda.advanced.oop.inheritance;

// parent
public class Vehicle {

    private int maxSpeed;

    // 1. default constructor
    public Vehicle() {
        System.out.println("building parent");
    }

    // 2. custom constructor
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
