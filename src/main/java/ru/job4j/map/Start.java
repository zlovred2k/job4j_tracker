package ru.job4j.map;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Start {

    public static void main(String[] args) {

        Map<Student, Set<Subject>> students = Map.of(
                new Student("Student", "000001", "201-18-15"),
                Set.of(new Subject("Math", 70),
                        new Subject("English", 85))
        );

        College college = new College(students);
        Student student = college.findByAccount("000001");
        System.out.println(student);
        Subject english = college.findBySubjectName("000001", "English");
        System.out.println(english);
    }
}
