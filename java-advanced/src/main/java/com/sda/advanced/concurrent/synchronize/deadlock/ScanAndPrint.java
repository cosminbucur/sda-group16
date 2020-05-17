package com.sda.advanced.concurrent.synchronize.deadlock;

public class ScanAndPrint implements Runnable {

    private final Printer printer;
    private final Scanner scanner;

    public ScanAndPrint(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        synchronized (printer) {
            System.out.println("Thread " + Thread.currentThread().getName() + " acquired scanner");
            try {
                // do scanning work
                scanner.scan();
                Thread.sleep(1000);
                System.out.println("Thread " + Thread.currentThread().getName() + " finished scanning");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // scan the documents already printed
            System.out.println("Thread " + Thread.currentThread().getName() + " is waiting for printer");
            synchronized (scanner) {
                printer.print();
                System.out.println("Thread " + Thread.currentThread().getName() + " is printing");
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " finished printing");
        }
    }
}
