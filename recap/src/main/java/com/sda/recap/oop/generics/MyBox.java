package com.sda.recap.oop.generics;

public class MyBox<E> {

    // HAS A
    private E item;

    // var 1:
    public MyBox(E newItem) {
        this.item = newItem;
    }

    // var 2:
    public void setItem(E newItem) {
        this.item = newItem;
    }
}
