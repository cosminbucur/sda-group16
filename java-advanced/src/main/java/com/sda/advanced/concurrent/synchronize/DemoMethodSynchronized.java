package com.sda.advanced.concurrent.synchronize;

public class DemoMethodSynchronized {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new CounterThread(counter);
        Thread thread2 = new CounterThread(counter);

        thread1.start();
        thread2.start();
        // 0 1 2 3 4 = 10
    }
}
