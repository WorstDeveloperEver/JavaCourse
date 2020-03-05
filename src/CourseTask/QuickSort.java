package CourseTask;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {2, 15, 1, 4, 89, 5, 8, 11};

        System.out.println("Sours array : " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        //System.out.println("Sorted array : " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 1) {
            return;
        }

        if (array.length == 2) {
            if (array[0] > array[1]) {
                int temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            } else {
                return;
            }
        }

        int middle = (left + right) / 2;
        int i = left;
        int j = right;

        while (i <= j) {
            int tempLeft = 0;
            for (; i <= right; i++) {
                if (array[i] >= array[middle]) {
                    tempLeft = i;
                    break;
                }
            }

            int tempRight = 0;
            for (; j >= left; j--) {
                if (array[j] <= array[middle]) {
                    tempRight = j;
                    break;
                }
            }

            int temp = array[tempRight];
            array[tempRight] = array[tempLeft];
            array[tempLeft] = temp;

            i++;
            j--;
            System.out.println("Sours array : " + Arrays.toString(array));
        }

        if (i < right) {
            quickSort(array, i, right);
        }
        if (j > left) {
            quickSort(array, left, j);
        }
    }
}
