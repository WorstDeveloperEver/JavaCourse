package Lecture9;

public class SortCheck {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 5, 5, 4, 3, 2, 1, 0};

        System.out.println("Array sorted to increase? " + isIncreaseSort(array));
        System.out.println("Array sorted to decrease? " + isDecreaseSort(array));
    }

    public static boolean isIncreaseSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDecreaseSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
