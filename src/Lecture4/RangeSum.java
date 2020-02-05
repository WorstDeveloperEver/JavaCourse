package Lecture4;

public class RangeSum {
    public static void main(String[] args) {
        int numbersCount = 9;
        int i = 1;
        int sum = 0;

        while (i <= numbersCount) {
            sum = (i % 2 != 0) ? (sum + i * i) : (sum - i * i);

            if (i == numbersCount) {
                System.out.printf("%d = %d", i * i, sum);
            } else if (i % 2 != 0) {
                System.out.printf("%d - ", i * i);
            } else {
                System.out.printf("%d + ", i * i);
            }
            i++;
        }
    }
}
