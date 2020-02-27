package Lecture9;

public class ShortingCheck {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("Array sorted to increase? " + isShortIncrease(array));
        System.out.println("Array sorted to decrease? " + isShortDecrease(array));
    }

    public static boolean isShortIncrease(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isShortDecrease(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
