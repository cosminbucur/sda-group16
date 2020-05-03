package com.sda.fundamentals.accessmodifiers.inside;

public class DemoPublic {

    public static void main(String[] args) {
        // same package, different class
        Parent parent = new Parent();
        System.out.println(parent.publicField);
    }
}
