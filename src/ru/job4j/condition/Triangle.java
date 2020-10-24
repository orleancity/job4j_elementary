package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ((ab < ac + bc) && (bc < ab + ac) && (ac < ab + bc));
    }

    public static void main(String[] args) {
        System.out.println(exist(2.0, 2.0, 2.0));
        System.out.println(exist(3.0, 4.0, 1.0));
    }
}