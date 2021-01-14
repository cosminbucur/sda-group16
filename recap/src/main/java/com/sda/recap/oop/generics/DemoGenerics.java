package com.sda.recap.oop.generics;

public class DemoGenerics {

    public static void main(String[] args) {
        Item firstItem = new Item();
        MyBox<Item> myBox = new MyBox(firstItem);

        myBox.setItem(firstItem);

        MyBox<Integer> myBox1 = new MyBox(2);
    }
}
