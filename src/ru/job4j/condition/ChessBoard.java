package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (Math.abs(x1 - x2) == Math.abs(y2 - y1)) {
            result = Math.abs(x1 - x2);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(way(6, 7, 1, 2));
        System.out.println(way(7, 0, 0, 7));
        System.out.println(way(2, 6, 4, 1));
    }
}