package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean forKids;

    public Doctor() {

    }

    public Doctor(String name, String surName, String education, String birthDay, boolean forKids) {
        super(name, surName, education, birthDay);
        this.forKids = forKids;
    }

    public void startHeal(Pacient pacient) {
        System.out.println("Start heal");
    }
}
