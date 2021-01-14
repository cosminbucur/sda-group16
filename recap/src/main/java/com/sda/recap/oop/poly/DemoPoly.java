package com.sda.recap.oop.poly;

public class DemoPoly {

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.makeSound();

        Animal animal = new Animal();
        animal.makeSound();
        Animal cat2 = new Cat();
        cat2.makeSound();
        Animal dog = new Dog();
        dog.makeSound();
    }
}
