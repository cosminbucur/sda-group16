package com.sda.advanced.exceptions;

import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {
//        tryCatchFinally();
        tryWithResources();
    }

    private static void tryCatchFinally() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("error with scanner");
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("scanner closed");
            }
        }
    }

    private static void tryWithResources() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("wow you typed: " + scanner.nextLine());
        } catch (Exception e) {
            // handle exception
        }

        System.out.println("scanner closed");
        // no need to close scanner in finally
    }
}
