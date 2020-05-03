package com.sda.fundamentals.accessmodifiers.inside;

public class DemoProtected {

    public static void main(String[] args) {
        // same package, different class
        Parent parent = new Parent();
        System.out.println(parent.protectedField);
    }
}
