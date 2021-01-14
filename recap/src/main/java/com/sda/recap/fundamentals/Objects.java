package com.sda.recap.fundamentals;

public class Objects {

    protected int age = 20;

    public static void main(String[] args) {
        DemoStatic.hello();
        DemoStatic demoStatic = new DemoStatic();
        demoStatic.nonStatic();
    }
}
