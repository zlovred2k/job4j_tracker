package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String typeSurgeon;

    public Surgeon(String name, String surName, String education,
                   String birthDay, boolean forKids, String typeSurgeon) {
        super(name, surName, education, birthDay, forKids);
        this.typeSurgeon = typeSurgeon;
    }

    public void choiceSurgeon(Diagnos diagnos) {
        System.out.println("diagnos");
    }
}
