package com.sda.advanced.exceptions;

public class DemoExceptions {

    public static void main(String[] args) {
        // parent of all objects
        Object object = new Object();

        // parent of all exceptions
        Throwable throwable = new Throwable();

        Exception exception = new Exception();

        System.out.println("scenario 1");
        divide(4, 2);
        System.out.println("scenario 2");
        divide(4, 0);
    }

    private static int divide(int x, int y) {
        int result = 0;
        try {
            result = x / y;
            System.out.println("the result is " + result);
        } catch (Exception e) {
            // handle exception

            // log info
            System.out.println("the message is " + e.getMessage());
            System.out.println("the message is " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("this happens no matter what");
        }

        return result;
    }
}
