package Lecture4;

public class Average {
    public static void main(String[] args) {
        int startRange = 2;
        int endRange = 10;

        int i = startRange;
        int sum = 0;
        int j = 0;
        while (i <= endRange) {
            sum += i;
            i++;
            j++;
        }

        System.out.printf("Average = %.2f%n", (double) sum / j);

        i = startRange;
        sum = 0;
        j = 0;
        while (i <= endRange) {
            if (i % 2 == 0) {
                sum += i;
                j++;
            }
            i++;
        }

        System.out.printf("Average of even numbers = %.2f", (double) sum / j);
    }
}
