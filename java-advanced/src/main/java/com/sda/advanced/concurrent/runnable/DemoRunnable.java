package com.sda.advanced.concurrent.runnable;

import java.util.Arrays;
import java.util.List;

public class DemoRunnable {

    public static void main(String[] args) {
        Runnable task = () -> System.out.println("running");
        Thread worker = new Thread(task);
        worker.start();

        // if lambda didn't exist
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable greetingRunnable = () -> System.out.println("hello from runnable");
        Thread thread1 = new Thread(greetingRunnable);

        final List<String> names = Arrays.asList("ana", "alex", "sorin");
        Runnable namePrinter = () -> {
            System.out.println("hello from complex runnable");
            names.forEach(name -> System.out.println(name));
        };
        Thread thread2 = new Thread(namePrinter);

        thread1.start();
        thread2.start();
    }
}
