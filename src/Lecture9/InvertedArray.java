package Lecture9;

import java.util.Arrays;

public class InvertedArray {
    public static void main(String[] args) {
        int[] array = {2, 95, 15, 16, 90, 6, 9, 10};

        getInvertedArray(array);

        System.out.print(Arrays.toString(array));
    }

    public static void getInvertedArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int buffer = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = buffer;
        }
    }
}
