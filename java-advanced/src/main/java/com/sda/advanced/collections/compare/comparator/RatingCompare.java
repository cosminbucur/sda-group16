package com.sda.advanced.collections.compare.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Episode> {

    @Override
    public int compare(Episode first, Episode second) {
        if (first.getRating() < second.getRating()) return -1;
        if (first.getRating() > second.getRating()) return 1;
        else return 0;
    }
}
