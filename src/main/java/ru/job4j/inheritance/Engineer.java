package ru.job4j.inheritance;

public class Engineer extends Profession {

    private int devExp;

    public Engineer() {
    }

    public Engineer(String name, String surName, String education, String birthDay, int devExp) {
        super(name, surName, education, birthDay);
        this.devExp = devExp;
    }

    public Project createProject() {
        System.out.println("Проект создан");
        return new Project();
    }

}
