package com.sda.advanced.oop.encapsulation;

public class DemoEncapsulation {

    public static void main(String[] args) {
//        Person validPerson = new Person("paul", true);
//        System.out.println(validPerson.getFirstName());
//        Person invalidPerson1 = new Person(null, true);
//        Person invalidPerson2 = new Person("", true);
//        invalidPerson1.setFirstName(null);
//        invalidPerson1.setFirstName("");
//
//        validPerson.setAge(20);
//        System.out.println(validPerson.getAge());
//        validPerson.growOlder();
//        System.out.println(validPerson.getAge());

        Person person = new Person("alex", true);
        person.setAge(20);
        person.printPersonState();

        System.out.println(person);
    }
}
