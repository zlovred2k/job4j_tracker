package ru.job4j.opp;

public class Battery {

    private int load;

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
}
