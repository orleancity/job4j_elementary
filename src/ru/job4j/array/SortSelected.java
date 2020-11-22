package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int t = data[i];
            if (data[i] > min) {
                data[i] = data[index];
                data[index] = t;
            }
        }
        return data;
    }
}
