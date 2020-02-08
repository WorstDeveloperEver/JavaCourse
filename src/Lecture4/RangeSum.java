package Lecture4;

public class RangeSum {
    public static void main(String[] args) {
        int numbersCount = 9;
        int i = 1;
        int sum = 0;

        while (i <= numbersCount) {
            int squaredI = i * i;

            if (i % 2 != 0) {
                sum += squaredI;
            } else {
                sum -= squaredI;
            }

            if (i == numbersCount) {
                System.out.printf("%d = %d", squaredI, sum);
            } else if (i % 2 != 0) {
                System.out.printf("%d - ", squaredI);
            } else {
                System.out.printf("%d + ", squaredI);
            }

            i++;
        }
    }
}
