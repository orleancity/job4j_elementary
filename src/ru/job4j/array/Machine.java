package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public static int[] change(int money, int price) {
        int[] result = new int[100];
        int size = 0;
        int surrender = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (surrender - COINS.length > 0) {
                result[size] = COINS[i];
                surrender = surrender - COINS[i];
                size++;
                break;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
