package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String devLang;

    public Programmer(String name, String surName, String education, String birthDay,
                      int devExp, String devLang) {
        super(name, surName, education, birthDay, devExp);
        this.devLang = devLang;
    }

    public void startProgram(Program that) {
        System.out.println("Program start");
    }
}
