package Lecture5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int userNumber = scanner.nextInt();

        if (userNumber <= 1) {
            System.out.println("Wrong number");
            return;
        }

        for (int i = 2; i <= userNumber; i++) {
            if (isPrimeNumber(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
