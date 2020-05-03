package com.sda.advanced.encapsulation;

// ABSTRACTION
public class Person {

    // ENCAPSULATION
    private String firstName;
    private boolean male;
    private int age;

    // ALT + INSERT = generate code

    public Person(String firstName, boolean male) {
        this.firstName = firstName;
        this.male = male;
    }

    // QUERY
    // getter
    public String getFirstName() {
        return firstName;
    }

    // COMMAND
    // write a method to change firstName
    public void setFirstName(String name) {
        // objects are compared with equals()
        // primitives are compared with ==
        if (name != null && !("".equals(name))) {
            this.firstName = name;
        }
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void growOlder() {
        this.age++;  // age = age + 1
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // print the state of the object
    public void printPersonState() {
        System.out.println("first name = " + this.firstName);
        System.out.println("age = " + this.age);
        System.out.println("male = " + this.male);
    }

    // from Object
    // Person IS-A Object
    @Override
    public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", male=" + male +
            ", age=" + age +
            '}';
    }
}
