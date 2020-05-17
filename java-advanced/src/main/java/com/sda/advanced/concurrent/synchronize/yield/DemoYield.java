package com.sda.advanced.concurrent.synchronize.yield;

public class DemoYield {

    public static void main(String[] args) {
        YieldRunnable task = new YieldRunnable();
        ThreadGroup allThreads = new ThreadGroup("All threads");
        Thread t1 = new Thread(allThreads, task, "t1");
        Thread t2 = new Thread(allThreads, task, "t2");
        Thread t3 = new Thread(allThreads, task, "t3");
        Thread t4 = new Thread(allThreads, task, "t4");
        Thread t5 = new Thread(allThreads, task, "t5");
        Thread t6 = new Thread(allThreads, task, "t6");
        Thread t7 = new Thread(allThreads, task, "t7");
        Thread t8 = new Thread(allThreads, task, "t8");
        Thread t9 = new Thread(allThreads, task, "t9");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t6.setPriority(Thread.NORM_PRIORITY);

        t7.setPriority(Thread.MIN_PRIORITY);
        t8.setPriority(Thread.MIN_PRIORITY);
        t9.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
    }
}
