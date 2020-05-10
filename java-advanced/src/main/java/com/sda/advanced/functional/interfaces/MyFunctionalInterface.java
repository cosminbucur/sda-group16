package com.sda.advanced.functional.interfaces;

@FunctionalInterface
public interface MyFunctionalInterface {

    // an abstract function
    void abstractFun(int x);

    default void normalFun() {
        System.out.println("default behavior");
    }
}
