package com.sda.advanced.concurrent.synchronize.deadlock;

public class PrintAndScan implements Runnable {

    private final Printer printer;
    private final Scanner scanner;

    public PrintAndScan(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        synchronized (printer) {
            System.out.println("Thread " + Thread.currentThread().getName() + " acquired printer");
            try {
                // do printing work
                printer.print();
                Thread.sleep(1000);
                System.out.println("Thread " + Thread.currentThread().getName() + " finished printing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // scan the documents already printed
            System.out.println("Thread " + Thread.currentThread().getName() + " is waiting for scanner");
            synchronized (scanner) {
                scanner.scan();
                System.out.println("Thread " + Thread.currentThread().getName() + " is scanning");
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " finished scanning");
        }
    }
}
