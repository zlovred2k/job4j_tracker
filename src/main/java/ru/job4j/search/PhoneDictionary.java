package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predName = x -> x.getName().contains(key);
        Predicate<Person> predSurname = x -> x.getSurname().contains(key);
        Predicate<Person> predPhone = x -> x.getPhone().contains(key);
        Predicate<Person> predAddress = x -> x.getAddress().contains(key);
        Predicate<Person> combine = predName.or(predSurname)
                .or(predPhone).or(predAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
