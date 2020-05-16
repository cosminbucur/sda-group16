package com.sda.advanced.collections.compare.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();

        list.add(new Movie("Game of thrones", 5));
        list.add(new Movie("Prison break", 3));
        list.add(new Movie("Breaking bad", 4));

        list.forEach(movie -> System.out.println(movie.getName() + " " + movie.getRating()));

        // sort list
        Collections.sort(list);

        System.out.println("after sorting");

        list.forEach(movie -> System.out.println(movie.getName() + " " + movie.getRating()));

        System.out.println("manual comparison");
        compareMovies(list);
    }

    private static void compareMovies(List<Movie> list) {
        // compare first and second element
        Movie first = list.get(0);  // 5
        Movie second = list.get(1); // 3

        int result = first.compareTo(second);
        System.out.println(result);
    }
}
