package com.sda.advanced.collections.compare.comparable;

public class Movie implements Comparable<Movie> {

    private String name;
    private int rating;

    public Movie(String name, int rating) {
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
    public int compareTo(Movie other) {
        // 0 = equals
        // - = this rating is lower
        // + = this rating is greater
        return this.rating - other.rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "name='" + name + '\'' +
            ", rating=" + rating +
            '}';
    }
}
