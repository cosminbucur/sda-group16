package com.sda.advanced.functional.interfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {

    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier =
            () -> {
                int result = new Random().nextInt();
                return result;
            };

        Supplier<Integer> randomNumberShortSupplier =
            () -> new Random().nextInt();
    }
}
