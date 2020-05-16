package com.sda.advanced.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DemoNio {

    public static void main(String[] args) {
        // Path - interface for handling path objects
        // Paths - transform a string to a path object

        // write to file using Path in nio
        Path path = Paths.get("/home/cosmin/dev/sda/sda-group16/java-advanced/src/main/resources/io/people.txt");

        List<String> people = Arrays.asList("alex", "laura", "paul");

        // Files - utility class for file operations
        try {
            Files.write(path, people);
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
