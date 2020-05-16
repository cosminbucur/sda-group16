package com.sda.advanced.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DemoBufferedReader {

    public static void main(String[] args) {
        // create a list of 3 people and write it in a file people.txt

        List<String> people = Arrays.asList("vlad", "ana", "cristi");

//        String winPath = "C:\\cosmin\\dev";
        String fileName = "io/people.txt";
        String path = "/home/cosmin/dev/sda/sda-group16/java-advanced/src/main/resources/io/" + fileName;

        writeUsingBufferedWriter(people, path);

        try {
            readUsingBufferedReader(path);
        } catch (IOException e) {
            System.out.println("error reading file");
        }
    }

    private static void readUsingBufferedReader(String path) throws IOException {
        // create file from path
        File source = new File(path);

        // read content
        // handle exception elsewhere
        BufferedReader br = new BufferedReader(new FileReader(source));

        // print each line
        // don't know the size of the file
        // can't iterate a file

        String line;
        // read until empty line
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void writeUsingBufferedWriter(List<String> list, String path) {
        // de unde iau numele?
        // tastatura, manual

        // in ce fisier scriu?
        File destination = new File(path);

        // cum scriu?
        // BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destination, false))) {
            // write items from list
            for (String item : list) {
                bw.write(item + "\n");
            }
        } catch (IOException e) {
            System.out.println("error writing in file " + destination);
        }
    }
}
