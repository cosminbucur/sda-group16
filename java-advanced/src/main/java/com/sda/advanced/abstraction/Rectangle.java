package com.sda.advanced.abstraction;

public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle(String color, int length, int width) {
        // call Shape constructor
        super(color);
        System.out.println("rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    int area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is: " + super.color +
            ", and area is: " + area();
    }
}
