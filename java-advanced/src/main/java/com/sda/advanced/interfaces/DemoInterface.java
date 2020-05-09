package com.sda.advanced.interfaces;

public class DemoInterface {

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(4, 5);
        System.out.println(myRectangle.getArea());

        // rectangle is a shape (implements)
        Shape myShape = myRectangle;
        System.out.println(myShape.getPerimeter());

        // call default method
        myShape.getColor();
    }

    public static void inlineInterface() {
        Shape myShape = new Shape() {
            // anonymous (inline) class / interface
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public void draw() {

            }
        };
    }
}
