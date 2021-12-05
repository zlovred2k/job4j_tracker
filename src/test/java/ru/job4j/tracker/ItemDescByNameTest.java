package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(5, "AAA"));
        items.add(new Item(1, "BBB"));
        items.add(new Item(3, "CCC"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "CCC"),
                new Item(1, "BBB"),
                new Item(5, "AAA")
        );
        assertThat(items, is(expected));
    }
}
