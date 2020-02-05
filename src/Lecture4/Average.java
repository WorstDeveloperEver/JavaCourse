package Lecture4;

public class Average {
    public static void main(String[] args) {
        int rangeStart = 2;
        int rangeEnd = 15;

        int i = rangeStart;
        int sum = 0;
        int digitCount = 0;
        while (i <= rangeEnd) {
            sum += i;
            i++;
            digitCount++;
        }

        double average = (double) sum / digitCount;
        System.out.printf("Average = %.2f%n", average);

        i = rangeStart;
        sum = 0;
        digitCount = 0;
        while (i <= rangeEnd) {
            if (i % 2 == 0) {
                sum += i;
                digitCount++;
            }
            i++;
        }

        average = (double) sum / digitCount;
        System.out.printf("Average = %.2f%n", average);
    }
}
