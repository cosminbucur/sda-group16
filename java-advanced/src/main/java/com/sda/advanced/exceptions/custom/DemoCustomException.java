package com.sda.advanced.exceptions.custom;

public class DemoCustomException {

    public static void main(String[] args) throws Exception {
        Car porche = new Car();

        // print initial speed
        System.out.println("initial speed " + porche.getSpeed());
        porche.increaseSpeed();
        porche.increaseSpeed();
        porche.increaseSpeed();
        porche.increaseSpeed();
        porche.increaseSpeed();
        porche.increaseSpeed();
        porche.increaseSpeed();
        porche.increaseSpeed();
    }
}
