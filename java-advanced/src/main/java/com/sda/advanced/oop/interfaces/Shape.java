package com.sda.advanced.oop.interfaces;

public interface Shape extends Drawable {

    // constant
//    public static final int LENGTH = 1;
    int LENGTH = 1;

    double getArea();

    double getPerimeter();

    // don't need explicit implementation
    default void getColor() {
        System.out.println("color");
    }

    default void getSize() {
        System.out.println("size");
    }
}
