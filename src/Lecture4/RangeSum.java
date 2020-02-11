package Lecture4;

public class RangeSum {
    public static void main(String[] args) {
        int numbersCount = 9;
        int i = 1;
        int sum = 0;

        while (i <= numbersCount) {
            int rangeNumber = i * i;

            if (i % 2 != 0) {
                sum += rangeNumber;
            } else {
                sum -= rangeNumber;
            }

            if (i == numbersCount) {
                System.out.printf("%d = %d", rangeNumber, sum);
            } else if (i % 2 != 0) {
                System.out.printf("%d - ", rangeNumber);
            } else {
                System.out.printf("%d + ", rangeNumber);
            }

            i++;
        }
    }
}
