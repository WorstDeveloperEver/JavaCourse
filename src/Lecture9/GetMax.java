package Lecture9;

public class GetMax {
    public static void main(String[] args) {
        double[] array = {2, 95, 15, 16, 89, 4, 9};

        System.out.println(getMax(array));
    }

    public static double getMax(double[] array) {
        final double epsilon = 1e-10;
        double max = array[0];

        for (double value : array) {
            if (value - max > epsilon) {
                max = value;
            }
        }

        return max;
    }
}
