package com.sda.advanced.exceptions;

public class DemoThrow {

    public static void main(String[] args) {
        try {
            somethingMightGoWrong();
        } catch (Exception e) {
            System.out.println("caught in main()");
        } finally {
            System.out.println("finally main()");
        }
    }

    private static void somethingMightGoWrong() {
        try {
            throw new NullPointerException("something is null");
        } catch (NullPointerException e) {
            System.out.println("caught in somethingMightGoWrong()");
        } finally {
            System.out.println("finally somethingMightGoWrong()");
        }
    }
}
