package com.sda.advanced.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoThrows {

    public static void main(String[] args) {
        int[] myArray = {3, 4, 2};

        try {
            printArrayElement(myArray, 3);
        } catch (Exception e) {
            System.out.println("please check your input");
        }
    }

    public static void printArrayElement(int[] intArray, int index) throws IOException {
        if (index < 0 || index >= intArray.length) {
            // checked - compile time exception
            throw new FileNotFoundException("incorrect argument");
        }
    }

    public static void throwsRuntimeException(int[] intArray, int index) {
        if (index < 0 || index >= intArray.length) {
            // unchecked - runtime exception
            throw new NullPointerException("incorrect argument");
        }
    }
}
