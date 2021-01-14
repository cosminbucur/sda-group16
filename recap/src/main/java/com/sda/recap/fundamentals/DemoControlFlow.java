package com.sda.recap.fundamentals;

public class DemoControlFlow {

    public void mySwitch() {
        int selectedNumber = 0;

        switch (selectedNumber) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("unknown");
        }
    }

    public void loops() {
        int[] numbers = {2, 3, 6, 8}; // size 4
        int[] numbers2 = new int[3]; // size 3

        // for ( from ; to ; step)
        for (int number = 0; number < numbers.length; number += 2) {
            if (number == 8) {
//                break;  // jump out of for
                return; // jump out of method
            }
            System.out.println(number);
        }

        int threshold = 6;
        int counter = 0;
        while (counter < threshold) {
            System.out.println(counter);
        }
    }
}
