package com.sda.advanced.concurrent.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorService {

    public static void main(String[] args) {
        System.out.println("Inside: " + Thread.currentThread().getName());

        System.out.println("Creating Executor service...");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Creating Runnable...");
        Runnable runnable = () -> {
            System.out.println("Inside: " + Thread.currentThread().getName());
        };

        System.out.println("Submit the task specified by the runnable to the executor service.");
        executorService.submit(runnable);

        System.out.println("Shutting down the executor");
        executorService.shutdown();
    }
}
