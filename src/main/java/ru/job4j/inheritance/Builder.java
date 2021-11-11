package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String layout;

    public Builder(String name, String surName, String education,
                   String birthDay, int devExp, String layout) {
        super(name, surName, education, birthDay, devExp);
        this.layout = layout;
    }

    public void startBuild(House that) {
        System.out.println("Start building house");
    }
}
