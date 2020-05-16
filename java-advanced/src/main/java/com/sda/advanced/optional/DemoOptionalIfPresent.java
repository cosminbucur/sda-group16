package com.sda.advanced.optional;

import java.util.Optional;

public class DemoOptionalIfPresent {

    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println();

        if (gender.isPresent()) {
            System.out.println("value available");
        } else {
            System.out.println("value not available");
        }

        gender.ifPresent(foundGender -> System.out.println("in gender optional, value available"));
        emptyGender.ifPresent(notFoundGender -> System.out.println("in emptyGender optional, value not available"));

    }
}
