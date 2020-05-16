package com.sda.advanced.collections.compare.comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Episode> {

    @Override
    public int compare(Episode first, Episode second) {
        return first.getName().compareTo(second.getName());
    }
}
