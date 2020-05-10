package com.sda.advanced.functional.interfaces.consumer;

import java.util.HashMap;
import java.util.Map;

public class DemoBiConsumer {

    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("ana", 25);
        ages.put("paul", 30);

        // print name - age
        ages.forEach((name, age) ->
            System.out.println("the entry is: " + name + " - " + age));

        // on multiple actions extract method = 1 line lambda
//        ages.forEach((name, age) -> multipleActions(name, age));
    }

    private static void multipleActions(String name, Integer age) {
        System.out.println("here is the map");
        System.out.println("the entry is: " + name + " - " + age);
        System.out.println("bye bye");
    }

    // old version
    private static void printMapElements(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String country = entry.getKey();
            Integer value = entry.getValue();
            System.out.printf(" %s : %d", country, value);
        }
    }
}
