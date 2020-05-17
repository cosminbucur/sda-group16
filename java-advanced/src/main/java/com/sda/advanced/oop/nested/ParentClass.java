package com.sda.advanced.oop.nested;

public class ParentClass {

    public ParentClass() {
        NestedClass nestedClass = new NestedClass();
        nestedClass.internalMethod();

        StaticNestedClass.staticInternalMethod();
    }

    public static class StaticNestedClass {
        public static void staticInternalMethod() {

        }
    }

    class NestedClass {
        public void internalMethod() {

        }
    }
}



