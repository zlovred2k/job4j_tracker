package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("количество пассажиров" + passengers);
    }

    @Override
    public double refuel(int fuel) {
        return fuel * 54;
    }
}

