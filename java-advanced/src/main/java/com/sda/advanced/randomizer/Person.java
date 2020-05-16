package com.sda.advanced.randomizer;

// TODO: nicoleta
public class Person {

    private String name;
    private int difficulty;
    private boolean isPresent;

    public Person(String name) {
        this.name = name;
        this.isPresent = true;
        this.difficulty = computeRandomDifficulty();
    }

    // TODO: razvan f
    private int computeRandomDifficulty() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
