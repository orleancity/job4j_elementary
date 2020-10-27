package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        int result2 = result > third ? result : third;
        return result2;
    }

    public static void main(String[] args) {
        System.out.println(MultiMax.max(1, 4, 2));
        System.out.println(MultiMax.max(8, 5, 7));
        System.out.println(MultiMax.max(8, 3, 9));
        System.out.println(MultiMax.max(6, 6, 6));
    }
}
