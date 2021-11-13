package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] newArrayItems = new Item[size];
        int sizeNew = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                newArrayItems[sizeNew] = items[i];
                sizeNew++;
            }
        }
        return Arrays.copyOf(newArrayItems, sizeNew);
    }

    public Item[] findByName(String key) {
        Item[] newArrayItems = new Item[size];
        int sizeNew = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                newArrayItems[sizeNew] = items[i];
                sizeNew++;
            }
        }
        return Arrays.copyOf(newArrayItems, sizeNew);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}