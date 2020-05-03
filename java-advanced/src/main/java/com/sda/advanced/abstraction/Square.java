package com.sda.advanced.abstraction;

public class Square extends Shape {

    int length;

    public Square(String color, int length) {
        // call Shape constructor
        super(color);
        System.out.println("rectangle constructor called");
        this.length = length;
    }

    @Override
    int area() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Rectangle color is: " + super.color +
            ", and area is: " + area();
    }
}
