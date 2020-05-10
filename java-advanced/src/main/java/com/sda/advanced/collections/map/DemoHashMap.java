package com.sda.advanced.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class DemoHashMap {

    public static void main(String[] args) {
        Map<String, Integer> countries = new TreeMap<>();

        // CREATE
        countries.put("Poland", 3);
        countries.put("Germany", 5);
        countries.put("England", 2);
        countries.put("Italy", 12);

        // READ
        int valueOfPoland = countries.get("Poland");    // 3

        // check if exits
        String countryToGet = "France";
        if (countries.containsKey(countryToGet)) {
            int valueOfFrance = countries.get(countryToGet);    // null
        }

        // UPDATE
        countries.replace("Germany", 7);

        // DELETE
        countries.remove("Poland");

        // print elements in map
        printMapElements(countries);
    }

    private static void printMapElements(Map<String, Integer> map) {
        // item : collection
        // Map.Entry = a single key-value combination
        // map.entrySet = unique key-value combinations
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String country = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf(" %s : %d", country, value);
        }
    }
}
