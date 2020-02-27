package Lecture9;

public class AverageNumberArray {
    public static void main(String[] args) {
        int[] array = {2, 95, 15, 16, 90, 6, 9};

        System.out.printf("Average = %.2f", getAverageEvenNumbers(array));
    }

    public static double getAverageEvenNumbers(int[] array) {
        int count = 0;
        double sum = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
                count++;
            }
        }

        return sum / count;
    }
}
