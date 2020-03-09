package Lecture10;

public class NumberInPow {
    public static void main(String[] args) {
        int degree = 6;
        int number = 5;

        System.out.printf("Number %d in degree %d = %d%n", number, degree, getNumberInPowRecursion(number, degree));
        System.out.printf("Number %d in degree %d = %d", number, degree, getNumberInPow(number, degree));
    }

    public static int getNumberInPowRecursion(int number, int degree) {
        if (degree == 0) {
            return 1;
        }

        return number * getNumberInPowRecursion(number, degree - 1);
    }

    public static int getNumberInPow(int number, int degree) {
        int sum = 1;
        for (int i = 0; i < degree; i++) {
        sum *=number;
        }
        return sum;
    }
}
