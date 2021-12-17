package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        /**
         * public interface BiConsumer<T, U>
         * void accept(T t, U u);
         */
        BiConsumer<Integer, String> biConsumer = (i, s) -> map.put(i, s);
        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");
        biConsumer.accept(3, "three");
        biConsumer.accept(4, "four");
        biConsumer.accept(5, "five");
        biConsumer.accept(6, "six");
        biConsumer.accept(7, "seven");

        /**
         * public interface BiPredicate<T, U>
         * boolean test(T t, U u);
         */
        BiPredicate<Integer, String> biPredicate = (i, s) -> i % 2 == 0 || s.length() == 4;
        for (Integer i : map.keySet()) {
            if (biPredicate.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        /**
         * public interface Supplier<T>
         * T get();
         */
        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        List<String> strings = supplier.get();

        Consumer<String> consumerStr = s -> System.out.println(s);
        /**
         * public interface Function<T, R>
         * R apply(T t);
         */
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
            consumerStr.accept(func.apply(s));
        }
    }
}
