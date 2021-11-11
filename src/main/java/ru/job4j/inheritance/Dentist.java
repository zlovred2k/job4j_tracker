package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String typeTherapy;

    public Dentist(String name, String surName,
                   String education, String birthDay, boolean forKids, String typeTherapy) {
        super(name, surName, education, birthDay, forKids);
        this.typeTherapy = typeTherapy;
    }

    public void changeHeal(Pacient pacient) {
        System.out.println("Change heal");
    }
}
