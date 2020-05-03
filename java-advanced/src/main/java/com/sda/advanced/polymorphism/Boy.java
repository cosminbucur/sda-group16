package com.sda.advanced.polymorphism;

// IS - A
public class Boy extends Human {

    @Override
    public void walk() {
        System.out.println("boy walks");
    }

    // can not override final method
//    public final void run() {
//        System.out.println("boy runs");
//    }

    // is this overriding?
    private void sing() {
        System.out.println("boy sings");
    }
}
