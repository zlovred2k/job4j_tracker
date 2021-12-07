package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] first = o1.split("\\.");
        String[] second = o2.split("\\.");
        return Integer.compare(
                Integer.parseInt(first[0]),
                Integer.parseInt(second[0]));
    }
}
