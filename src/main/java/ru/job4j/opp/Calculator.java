package ru.job4j.opp;

public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(add(first, second), third);
    }

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int number) {
        return number - x;
    }

    public int sumAllOperation(int number) {
        return sum(number) + multiply(number) + minus(number);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int x = sum(5);
        int multi = calc.multiply(5);
        int y = minus(10);
        int sumAll = calc.sumAllOperation(10);
    }
}
