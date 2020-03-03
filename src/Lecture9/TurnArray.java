package Lecture9;

import java.util.Arrays;

public class TurnArray {
    public static void main(String[] args) {
        int[] array = {2, 95, 15, 16, 90, 6, 9, 10};

        toTurnArray(array);

        System.out.print(Arrays.toString(array));
    }

    public static void toTurnArray(int[] array) {
        int arrayMiddle = array.length / 2;
        for (int i = 0; i < arrayMiddle; i++) {
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
    }
}
