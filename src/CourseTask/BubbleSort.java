package CourseTask;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 15, 1, 4, 89, 5, 8, 11};

        System.out.println("Source array: " + Arrays.toString(array));

        SortByBubble(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void SortByBubble(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {
            boolean isSorted = true;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }
    }
}
