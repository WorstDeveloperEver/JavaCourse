package Lecture4;

public class DoWhile {
    public static void main(String[] args) {
        int startRange = 3;
        int endRange = 17;

        int i = startRange;
        int sum = 0;
        int j = 0;
        do {
            sum += i;
            i++;
            j++;
        } while (i <= endRange);

        System.out.printf("Average = %.2f%n", (double) sum / j);

        i = startRange;
        sum = 0;
        j = 0;
        do {
            if (i % 2 == 0) {
                sum += i;
                j++;
            }
            i++;
        } while (i <= endRange);

        System.out.printf("Average of even numbers = %.2f", (double) sum / j);
    }
}