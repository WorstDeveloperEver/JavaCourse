package CourseTask;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number in the sequence:");
        int searchNumber = scanner.nextInt();

        if (searchNumber < 0) {
            System.out.println("Wrong number");
            return;
        }

        int fibonacciN0 = 0;
        int fibonacciN1 = 1;

        if (searchNumber == 0) {
            System.out.println("Answer: " + fibonacciN0);
            return;
        }
        if (searchNumber == 1) {
            System.out.println("Answer: " + fibonacciN1);
            return;
        }

        int fibonacciN2 = 0;
        int i = 3;
        while (i <= searchNumber) {
            fibonacciN2 = fibonacciN0 + fibonacciN1;
            fibonacciN0 = fibonacciN1;
            fibonacciN1 = fibonacciN2;
            i++;
        }
        System.out.println("Answer: " + fibonacciN2);

    }
}
