package com.sda.advanced.oop.inheritance;

public class DemoInheritance {

    public static void main(String[] args) {
        testInheritance();

        testConstructionOrder();
    }

    public static void testInheritance() {
        // CTR + P - display parameters of a method
        Vehicle vehicle2 = new Vehicle(300);

        Car car = new Car(150, false);
        car.getMaxSpeed();

        // IS-A
        Vehicle vehicle = new Car(200, true);
        vehicle.getMaxSpeed();
    }

    public static void testConstructionOrder() {
        Car car = new Car();
    }
}
