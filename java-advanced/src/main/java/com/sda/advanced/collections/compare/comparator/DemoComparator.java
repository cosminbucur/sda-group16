package com.sda.advanced.collections.compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparator {

    public static void main(String[] args) {
        List<Episode> list = new ArrayList<>();

        list.add(new Episode("Game of thrones", 5));
        list.add(new Episode("Prison break", 3));
        list.add(new Episode("Breaking bad", 4));

        list.forEach(movie -> System.out.println(movie.getName() + " " + movie.getRating()));

        // sort list by rating
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);

        // sort list by name
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);

        list.forEach(movie -> System.out.println(movie.getName() + " " + movie.getRating()));
    }
}
