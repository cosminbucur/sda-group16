package com.sda.recap.oop;

// imports

import java.util.Objects;

// class signature
public class MyClass {

    // static variables
    private static final int TEMP = 10;
    protected String name;
    // class variables / fields
    private int age = 20;
    private int size;

    // constructor
    public MyClass() {
        // default constructor
    }

    // custom constructor
    public MyClass(int newSize) {
        // keyword
        this.size = newSize;
    }

    // other methods

    // getters / setters
    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return age == myClass.age && size == myClass.size;
    }

    // hashcode
    @Override
    public int hashCode() {
        return Objects.hash(age, size);
    }

    // to string
    @Override
    public String toString() {
        return "MyClass{" +
            "age=" + age +
            ", size=" + size +
            '}';
    }
}


class MyClass2 {

}

class MyClass3 {

}