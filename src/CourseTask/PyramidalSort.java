package CourseTask;

import java.util.Arrays;

public class PyramidalSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};

        System.out.println("Sours array : " + Arrays.toString(array));

        pyramidalSort(array);

        System.out.println("Sorted array : " + Arrays.toString(array));
    }

    public static void pyramidalSort(int[] array) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            doScreening(array, i, length);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            doScreening(array, 0, i);
        }
    }

    public static void doScreening(int[] array, int parent, int length) {
        int max = parent;
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;

        if (left < length && array[left] > array[max]) {
            max = left;
        }

        if (right < length && array[right] > array[max]) {
            max = right;
        }

        if (max != parent) {
            int temp = array[parent];
            array[parent] = array[max];
            array[max] = temp;

            doScreening(array, max, length);
        }
    }
}
