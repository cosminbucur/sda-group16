package com.sda.advanced.concurrent.thread;

public class MyExtendedThread extends Thread {

    @Override
    public void run() {
        System.out.println("message from thread");
    }
}
