package CourseTask;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {2, 15, 1, 4, 89, 5, 8, 11};

        System.out.println("User array: " + Arrays.toString(array));

        doInsertSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void doInsertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int temp = array[i];
            int j = i - 1;

            while (j >= 0) {
                if (temp >= array[j]) {
                    break;
                }

                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
