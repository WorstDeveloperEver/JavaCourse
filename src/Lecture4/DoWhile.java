package Lecture4;

public class DoWhile {
    public static void main(String[] args) {
        int rangeStart = 3;
        int rangeEnd = 17;

        int i = rangeStart;
        int sum = 0;
        int numbersCount = 0;
        do {
            sum += i;
            i++;
            numbersCount++;
        } while (i <= rangeEnd);

        double average = (double) sum / numbersCount;
        System.out.printf("Average = %.2f%n", average);

        i = rangeStart;
        sum = 0;
        numbersCount = 0;
        do {
            if (i % 2 == 0) {
                sum += i;
                numbersCount++;
            }
            i++;
        } while (i <= rangeEnd);

        average = (double) sum / numbersCount;
        System.out.printf("Average of even numbers = %.2f", average);
    }
}