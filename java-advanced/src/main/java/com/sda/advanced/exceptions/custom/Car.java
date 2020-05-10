package com.sda.advanced.exceptions.custom;

public class Car {

    private int speed;

    public void increaseSpeed() throws CarCrashedException {
        this.speed += 70;

        if (this.speed > 200) {
            // exception
            throw new CarCrashedException(this);
        }
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
            "speed=" + speed +
            '}';
    }
}
