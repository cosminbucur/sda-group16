package com.sda.advanced.functional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStreams {

    // Get the unique names in uppercase of the first
    // 15 book authors that are 50 years old or over
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        List<String> names = library.stream()           // Stream<Book>
            .map(book -> book.getAuthor())              // Stream<Author>
            .filter(author -> author.getAge() >= 50)    // Stream<Author>
            .distinct()                                 // Stream<Author>
            .limit(15)                                  // Stream<Author>
            .map(author -> author.getName())            // Stream<String>
            .map(name -> name.toUpperCase())            // Stream<String>
            .collect(Collectors.toList());              // List<String>

        names.forEach(name -> System.out.println(name));

    }
}
