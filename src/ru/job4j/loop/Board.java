package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                if ((x + y) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board.paint(3, 3);
        System.out.println();
        Board.paint(4, 4);
    }
}
