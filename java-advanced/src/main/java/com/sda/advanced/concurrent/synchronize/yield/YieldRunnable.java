package com.sda.advanced.concurrent.synchronize.yield;

public class YieldRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(System.nanoTime() +
            " Current thread: " + Thread.currentThread().getName() + " START");

        // give thread with equal priority chance to run
        Thread.yield();

        System.out.println(System.nanoTime() +
            " Current thread: " + Thread.currentThread().getName() + " STOP");
    }
}
