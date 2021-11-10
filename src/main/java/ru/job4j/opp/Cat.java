package ru.job4j.opp;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("name cat: " + this.name + ", food: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gavgav");
        gav.eat("Kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();

    }
}
