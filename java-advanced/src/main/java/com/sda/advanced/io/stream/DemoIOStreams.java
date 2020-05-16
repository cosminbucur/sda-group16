package com.sda.advanced.io.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoIOStreams {

    public static void main(String[] args) {
        // write person using file output stream

        // source
        Person person = new Person();
        person.setFirstName("ana");
        person.setLastName("vasile");

        // destination file
        String fileName = "io/fileForStream.txt";
        String path = "/home/cosmin/dev/sda/sda-group16/java-advanced/src/main/resources/io/" + fileName;

        // write to file
        writeUsingFileOutputStream(path, person);
    }

    private static void writeUsingFileOutputStream(String path, Person person) {
        File destination = new File(path);

        try (FileOutputStream fos = new FileOutputStream(destination)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (IOException e) {
            System.out.println("error writing stream");
        }
    }

    // TODO read using input stream
}
