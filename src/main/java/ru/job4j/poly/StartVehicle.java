package ru.job4j.poly;

public class StartVehicle {

    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{train, airplane, bus};
        for (Vehicle v:vehicles) {
            v.move();
        }
    }
}
