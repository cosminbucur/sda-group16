package com.sda.advanced.collections.compare.comparator;

public class Episode {

    private String name;
    private int rating;

    public Episode(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "name='" + name + '\'' +
            ", rating=" + rating +
            '}';
    }
}
