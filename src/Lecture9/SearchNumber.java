package Lecture9;

public class SearchNumber {
    public static void main(String[] args) {
        int[] array = {2, 95, 15, 16, 89, 4, 9};

        System.out.println(searchNumber(array, 4));
    }

    public static int searchNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }
}
