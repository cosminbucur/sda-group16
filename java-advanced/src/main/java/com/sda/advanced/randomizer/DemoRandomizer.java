package com.sda.advanced.randomizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class DemoRandomizer {

    public static final String PEOPLE_SOURCE = "/home/cosmin/dev/sda/sda-group16/java-advanced/src/main/resources/io/people.txt";
    private static final Logger logger = Logger.getLogger(DemoRandomizer.class.getName());

    public static void main(String[] args) {
        // input name from keyboard
        String name = readFromInput();

        // create a person object
        Person person = new Person(name);
        // set presence
        // set difficulty

        // store people in a list
        List<Person> people = new ArrayList<>();
        people.add(person);

        // save (persist) data to a storage
        save(people);

        // TODO: ioana
        Path peopleSource = Paths.get(PEOPLE_SOURCE);
        List<String> names = loadNamesFromFile(peopleSource);
        // ana, alex, cristi -> Person

        Set<Person> peopleFromFile = names.stream()     // Stream<String>
            .map(personName -> new Person(personName))  // Stream<Person>
            .collect(Collectors.toSet());

        // iterate peopleFromFile and add to people
        peopleFromFile.forEach(uniquePerson -> people.add(uniquePerson));
    }

    private static List<String> loadNamesFromFile(Path source) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(source);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "error reading from file {0}", source);
        }
        return result;
    }

    // File + BufferedReader

    // Path + Files

    // save to file
    private static void save(List<Person> people) {
        // create file
        // open writer
        // iterate list
        // write
        Path destination = Paths.get("/home/cosmin/dev/sda/sda-group16/java-advanced/src/main/resources/io/name-list.txt");
        try {
            // FIXME: find a way to write objects to a file
            Files.write(destination, null, null, null);
        } catch (IOException e) {

        }
    }

    private static String readFromInput() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}
