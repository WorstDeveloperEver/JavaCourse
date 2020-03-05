package Lecture10;

public class NumberInDegree {
    public static void main(String[] args) {
        int degree = 6;
        int number = 5;

        System.out.printf("Number %d in degree %d = %d", number, degree, getNumberInDegree(number, degree));
    }

    public static int getNumberInDegree(int number, int degree) {
        if (degree == 0) {
            return 1;
        }

        return number * getNumberInDegree(number, degree - 1);
    }
}
