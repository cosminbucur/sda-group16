package com.sda.advanced.concurrent.synchronize.bus;

public class PassengerThread extends Thread {

    private int seatsNeeded;

    public PassengerThread(int seatsNeeded, Runnable task, String name) {
        super(task, name);
        this.seatsNeeded = seatsNeeded;
    }

    public int getSeatsNeeded() {
        return seatsNeeded;
    }
}
