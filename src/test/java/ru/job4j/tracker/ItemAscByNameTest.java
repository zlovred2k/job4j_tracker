package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void compare() {

        List<Item> items = new ArrayList<>();
        items.add(new Item(5, "AAA"));
        items.add(new Item(1, "BBB"));
        items.add(new Item(3, "CCC"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(5, "AAA"),
                new Item(1, "BBB"),
                new Item(3, "CCC")
        );
        assertThat(items, is(expected));
    }
}