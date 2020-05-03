package com.sda.fundamentals.accessmodifiers.inside;

public class Child extends Parent {

    public void testFieldFromParent() {
        String staticFieldOnParentInstance = Parent.staticField;
        String staticFieldOnChildInstance = Child.staticField;

        String one = super.publicField;
        String two = super.protectedField;
        String three = super.defaultField;
    }
}
