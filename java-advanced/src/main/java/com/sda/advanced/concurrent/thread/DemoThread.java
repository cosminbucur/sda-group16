package com.sda.advanced.concurrent.thread;

public class DemoThread {

    public static void main(String[] args) {
        runExtendedThread();
    }

    private static void runExtendedThread() {
        MyExtendedThread t1 = new MyExtendedThread();
        MyExtendedThread t2 = new MyExtendedThread();

        t1.start();
        t2.start();
    }
}
