package com.sda.advanced.oop.abstraction;

public class DemoAbstraction {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle("red", 2, 4);
        Shape shape2 = new Square("blue", 3);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}
