package com.sda.advanced.oop.enums;

public enum Role {

    ARCHER("archer ready"),
    ASSASSIN("assassin ready"),
    FIGTHER("fighter ready");

    private String description;

    // enum constructor
    Role(String description) {
        this.description = description;
    }

    public void printEnum() {
        // iterate
        Role.values();  // Role[]

//        for (int i = 0; i < Role.values().length; i++) {
//            System.out.println(Role.values()[i]);
//        }

        Role[] roles = Role.values();
        // element : collection
        for (Role role : roles) {
            System.out.println(role.name() + " " + role.ordinal() + " ");
        }
    }

    public String getDescription() {
        return description;
    }
}
