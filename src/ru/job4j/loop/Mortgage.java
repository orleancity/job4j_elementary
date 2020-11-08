package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double pay = amount + (amount * (percent / 100));
            amount = pay - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        Mortgage.year(1000, 1200, 1);
        Mortgage.year(100, 120, 50);
    }
}
