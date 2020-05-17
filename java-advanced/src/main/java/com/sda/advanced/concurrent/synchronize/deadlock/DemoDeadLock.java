package com.sda.advanced.concurrent.synchronize.deadlock;

public class DemoDeadLock {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        Thread rober = new Thread(new PrintAndScan(printer, scanner));
        rober.start();

        Thread anca = new Thread(new ScanAndPrint(printer, scanner));
        anca.start();
    }
}
