package com.sda.fundamentals.accessmodifiers;

import com.sda.fundamentals.accessmodifiers.inside.Parent;

public class DemoProtectedOutside {

    public static void main(String[] args) {
        // different package, different class
        Parent parent = new Parent();
//        System.out.println(parent.protectedField);
    }

}
