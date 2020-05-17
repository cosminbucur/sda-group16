package com.sda.advanced.concurrent.synchronize.join;

public class DemoJoin {

    public static Thread t1;
    public static Thread t2;

    public static void main(String[] args) {
        JoinThreads task = new JoinThreads();
        t1 = new Thread(task, "T1");
        t2 = new Thread(task, "T2");
        t1.start();

        // check state of threads
        while (true) {
            Thread.State t1State = t1.getState();
            Thread.State t2State = t2.getState();

            System.out.println(System.nanoTime() + " T1: " + t1State);
            System.out.println(System.nanoTime() + " T2: " + t2State);

            // stop printing states when both treads finish
            if (t1State.equals(Thread.State.TERMINATED) &&
                t2State.equals(Thread.State.TERMINATED)) {
                break;
            }
        }
    }
}
