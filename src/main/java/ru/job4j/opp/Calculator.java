package ru.job4j.opp;

public class Calculator {

    private static int x = 5;
    private int xyz;

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
