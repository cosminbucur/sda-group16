package com.sda.recap.oop;

public class Parent {

    public static final String PARENT_STRING = "from parent";

    {
        System.out.println("static parent");
    }

    public Parent() {
        System.out.println("in parent");
    }
}
