package Lecture4;

public class RangeSum {
    public static void main(String[] args) {
        int numbersCount = 9;
        int i = 0;
        int k = 1;
        int j = 1;
        int sum = 1;

        while (i <= numbersCount) {
            if (i == numbersCount) {
                System.out.printf("%d = %d", k, sum);
            } else if (k % 2 != 0) {
                System.out.printf("%d - ", k);
            } else {
                System.out.printf("%d + ", k);
            }

            j += 2;
            k += j;
            sum = (k % 2 != 0) ? sum + k : sum - k;

            i++;
        }
    }
}
