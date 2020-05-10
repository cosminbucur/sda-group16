package com.sda.advanced.exceptions.custom;

// if my exception extends exception -> either checked or unchecked
// if my exception extends runtime exception -> unchecked
public class CarCrashedException extends Exception {

    // add information to the exception
    public CarCrashedException(Car car) {
        super("car " + car + " has crashed");
    }
}
