package ru.job4j.poly;

public class StartVehicle {

    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{train, airplane};
        for (Vehicle v:vehicles) {
            v.move();
        }
    }
}
