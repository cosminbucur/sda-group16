package com.sda.advanced.concurrent.synchronize;

public class CounterThread extends Thread {

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.add(i);
            System.out.println(System.nanoTime() +
                " Current thread: " + Thread.currentThread().getName() +
                " counter = " + counter.getCount());
        }
    }
}
