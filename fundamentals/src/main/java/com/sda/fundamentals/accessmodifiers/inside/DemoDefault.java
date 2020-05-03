package com.sda.fundamentals.accessmodifiers.inside;

public class DemoDefault {

    public static void main(String[] args) {
        // same package, different class
        Parent parent = new Parent();
        System.out.println(parent.defaultField);
    }
}
