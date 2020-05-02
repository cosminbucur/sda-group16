package com.sda.testing.junit;

public class Calculator {

    // add two numbers

    // access mod keyword return type name params
    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int divide(int number, int divider) {
        if (divider == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return number / divider;
    }

    // subtract two numbers
}
