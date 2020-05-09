package com.sda.fundamentals.accessmodifiers2.away;

import com.sda.fundamentals.accessmodifiers2.home.Parent;

public class Sister extends Parent {

    public void hasAccessTo() {
        System.out.println("public " + super.phoneNumber);
        System.out.println("protected " + super.wealth);
    }

    public void noAccessTo() {
//        System.out.println("default " + super.familyToilet);
//        System.out.println("private " + super.personalClothes);
    }
}
