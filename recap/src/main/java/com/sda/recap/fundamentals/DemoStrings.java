package com.sda.recap.fundamentals;

public class DemoStrings {

    public static void main(String[] args) {
        String name = "alex";
        String lastName = new String();
        lastName = "alex";
//        lastName = null;    // null reference
//        lastName = "";  // empty string

        if (name.equals(lastName)) {
            System.out.println("");
        }

        if (name == lastName) {
            System.out.println("");
        }
    }
}
