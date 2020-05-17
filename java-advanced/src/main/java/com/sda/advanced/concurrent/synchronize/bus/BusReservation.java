package com.sda.advanced.concurrent.synchronize.bus;

public class BusReservation implements Runnable {

    private int availableSeats = 2;

    @Override
    public void run() {
        PassengerThread passenger = (PassengerThread) Thread.currentThread();

        boolean tickedBooked = bookTickets(passenger.getSeatsNeeded());

        if (tickedBooked) {
            System.out.println("Ok, " + Thread.currentThread().getName() + ", you have booked " +
                passenger.getSeatsNeeded() + " seats.");
        } else {
            System.out.println("Sorry " + Thread.currentThread().getName() + ", " +
                passenger.getSeatsNeeded() + " seats are not available.");
        }
    }

    private synchronized boolean bookTickets(int seatsNeeded) {
        System.out.println("Welcome " + Thread.currentThread().getName() + "! There are " +
            this.getAvailableSeats() + " available seats.");

        if (seatsNeeded > this.getAvailableSeats()) {
            return false;
        } else {
            availableSeats = availableSeats - seatsNeeded;
            return true;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
