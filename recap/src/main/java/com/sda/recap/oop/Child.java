package com.sda.recap.oop;

public class Child extends Parent {

    public static final String CHILD_STRING = "from child";

    {
        System.out.println("static child");
    }

    public Child() {
        System.out.println("in child");
    }
}
