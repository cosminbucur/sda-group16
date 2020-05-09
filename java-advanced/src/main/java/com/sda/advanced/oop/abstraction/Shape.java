package com.sda.advanced.oop.abstraction;

public abstract class Shape {

    String color;

    // can abstract class have a constructor
    public Shape(String color) {
        System.out.println("shape constructor called");
        this.color = color;
    }

    // abstract methods
    abstract int area();

    // non abstract method
    public String getColor() {
        return color;
    }
}
