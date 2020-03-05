package CourseTask;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 15, 1, 4, 89, 5, 8, 11};

        System.out.println("Sours array : " + Arrays.toString(array));

        toSelectionSort(array);

        System.out.println("Sorted array : " + Arrays.toString(array));
    }

    public static void toSelectionSort(int[] array) {
        for (int start = 0; start < array.length - 1; start++) {
            int min = start;

            for (int i = start + 1; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }

            int temp = array[min];
            array[min] = array[start];
            array[start] = temp;
        }
    }
}
