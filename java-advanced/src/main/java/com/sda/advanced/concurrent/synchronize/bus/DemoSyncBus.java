package com.sda.advanced.concurrent.synchronize.bus;

public class DemoSyncBus {

    public static void main(String[] args) {
        BusReservation task = new BusReservation();
        PassengerThread p1 = new PassengerThread(2, task, "Ana");
        PassengerThread p2 = new PassengerThread(2, task, "Alex");
        p1.start();
        p2.start();
    }
    /*
    sync issue:
    Welcome Ana! There are 2 available seats.
    Welcome Alex! There are 2 available seats.
    Ok, Ana, you have booked 2 seats.
    Sorry Alex, 2 seats are not available.
     */
}
