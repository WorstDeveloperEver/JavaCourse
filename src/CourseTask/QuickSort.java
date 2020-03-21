package CourseTask;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {2, 15, 1, 4, 89, 5, 8, 11};

        System.out.println("Sours array : " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array : " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (right - left == 0) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }

            return;
        }

        if (array.length == 0) {
            return;
        }

        int middle = array[(left + right) / 2];

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < middle) {
                i++;
            }

            while (array[j] > middle) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (i < right) {
            quickSort(array, i, right);
        }

        if (j > left) {
            quickSort(array, left, j);
        }
    }
}
