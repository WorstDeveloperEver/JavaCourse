package Lecture9;

public class MaxNumberInArray {
    public static void main(String[] args) {
        double[] array = {2, 95, 15, 16, 89, 4, 9};

        System.out.println("Max number = " + getMax(array));
    }

    public static double getMax(double[] array) {
        double maxNumber = array[0];

        for (double value : array) {
            if (value > maxNumber) {
                maxNumber = value;
            }
        }

        return maxNumber;
    }
}
