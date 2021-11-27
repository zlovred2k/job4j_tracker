package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {

    public static void main(String[] args) {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Petr");
        testArray.add("Ivan");
        testArray.add("Stepan");
        for (String value : testArray) {
            System.out.println(value);
        }
    }
}
