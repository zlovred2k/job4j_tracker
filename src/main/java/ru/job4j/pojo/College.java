package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurName("Ivanov");
        student.setGroup("Java");
        student.setDate(new Date());
        System.out.println("name: " + student.getName() + ", surName: " + student.getSurName()
                + ", group: " + student.getGroup() + ", data: " + student.getDate());
    }
}
