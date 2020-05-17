package com.sda.advanced.concurrent.synchronize.join;

public class JoinThreads implements Runnable {

    @Override
    public void run() {
        // time - thread name - START
        System.out.println(System.nanoTime() +
            " Current thread: " + Thread.currentThread().getName() + " START");

        // use join
        if (Thread.currentThread().getName().equals("T1")) {
            try {
                System.out.println(System.nanoTime() + " Inside join condition");
                DemoJoin.t2.start();
                DemoJoin.t2.join();     // stop t1 until t2 has finished
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(System.nanoTime() +
            "Current thread: " + Thread.currentThread().getName() + " END");
    }
}
