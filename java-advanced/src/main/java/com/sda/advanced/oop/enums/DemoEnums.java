package com.sda.advanced.oop.enums;

public class DemoEnums {

    public static void main(String[] args) {
        Hero fighter = new Hero(500, Role.FIGTHER);
        Hero archer = new Hero(100, Role.ARCHER);

        // print all values in enum
        fighter.getRole().printEnum();

        Role archerRole = archer.getRole();
        String archerDescription = archerRole.getDescription();
        System.out.println(archerDescription);
    }
}
