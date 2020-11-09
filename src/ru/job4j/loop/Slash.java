package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                boolean left = (x - y) == 0;
                boolean right = (x + y) == size - 1;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3 ");
        draw(3);
        System.out.println("Draw by 5 ");
        draw(5);
    }
}
