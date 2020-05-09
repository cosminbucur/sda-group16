package com.sda.advanced.oop.interfaces;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // from shape
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    // from drawable
    @Override
    public void draw() {

    }
}
