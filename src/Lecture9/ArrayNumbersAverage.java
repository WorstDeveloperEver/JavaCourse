package Lecture9;

public class ArrayNumbersAverage {
    public static void main(String[] args) {
        int[] array = {2, 95, 15, 16, 90, 6, 9};

        System.out.printf("Average = %.2f", getEvenNumbersAverage(array));
    }

    public static double getEvenNumbersAverage(int[] array) {
        int count = 0;
        int sum = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
                count++;
            }
        }

        return (double) sum / count;
    }
}
