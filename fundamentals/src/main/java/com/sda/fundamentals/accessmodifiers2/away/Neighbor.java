package com.sda.fundamentals.accessmodifiers2.away;

import com.sda.fundamentals.accessmodifiers2.home.Parent;

public class Neighbor {

    public void hasAccessTo() {
        System.out.println("wealth from parent " + new Parent().phoneNumber);
    }

    public void noAccessTo() {
//        System.out.println("default " + new Parent().familyToilet);
//        System.out.println("protected " + new Parent().wealth);
//        System.out.println("private " + new Parent().personalClothes);
    }
}
