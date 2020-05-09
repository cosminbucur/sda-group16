package com.sda.advanced.exceptions;

public class DemoMultipleCatch {

    public static void main(String[] args) {
//        divide();
        divide2();
    }

    private static void divide() {
        int[] intArray = {1, 2, 3};
        int y = 0;

        // someone could query an item outside of array
        try {
            int x = intArray[1] / y;
            // some other code

            // from the most specific to the most general
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("this item doesn't exist.");
        } catch (ArithmeticException e) {
            System.out.println("check your math!");
        } catch (Exception e) {
            System.out.println("you must be crazy");
        }
    }

    private static void divide2() {
        int[] intArray = {1, 2, 3};
        int y = 0;

        try {
            int x = intArray[1] / y;

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("something is wrong, please check.");
        }
    }
}
