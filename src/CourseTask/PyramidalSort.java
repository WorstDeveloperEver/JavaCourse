package CourseTask;

import java.util.Arrays;

public class PyramidalSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};

        System.out.println("Source array: " + Arrays.toString(array));

        sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
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

        while (true) {
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

                parent = max;
            } else {
                return;
            }
        }
    }
}
