package com.sda.advanced.concurrent.thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("message from thread");
    }
}
