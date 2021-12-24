package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-100, 5, -12, -5, -3, 6, 1, 0);
        List<Integer> positive = numbers.stream().filter(
                x -> x > 0
        ).collect(Collectors.toList());
    }
}
