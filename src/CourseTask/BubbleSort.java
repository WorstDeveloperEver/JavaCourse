package CourseTask;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 15, 1, 4, 89, 5, 8, 11};

        System.out.println("Sours array : " + Arrays.toString(array));

        toBubbleSort(array);

        System.out.println("Sorted array : " + Arrays.toString(array));
    }

    public static void toBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int count = 0;

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    count++;
                }
            }

            if (count == 0) {
                break;
            }
        }
    }
}
