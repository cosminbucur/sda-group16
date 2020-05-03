package com.sda.advanced.polymorphism;

public class DemoDynamicPolymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.walk();
        dog.walk();
    }
}
