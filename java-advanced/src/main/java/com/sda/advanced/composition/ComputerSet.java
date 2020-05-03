package com.sda.advanced.composition;

// COMPOSITION
public class ComputerSet {

    // HAS-A monitor
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    public ComputerSet(Monitor monitor, Mouse mouse) {
        this.monitor = monitor;
        this.mouse = mouse;
    }
}
