package com.sda.advanced.collections.generics;

// can hold any type of object
public class GenericBox<T> {

    // has an item
    private T item;

    // 1. set item in constructor
    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    // 2. set item with setter
    public void setItem(T item) {
        this.item = item;
    }
}
