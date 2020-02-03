package Lecture4;

import java.util.Scanner;

public class NumbersDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        int i = Math.abs(number);
        int sumDigit = 0;
        int sumOddDigit = 0;
        int maxDigit = 0;

        while (i > 0) {
            int digit = i % 10;

            sumDigit += digit;

            if (digit % 2 != 0) {
                sumOddDigit += digit;
            }

            if (maxDigit < digit) {
                maxDigit = digit;
            }
            i /= 10;
        }
        System.out.printf("Sum digit = %d, Sum odd digit = %d, Max digit = %d", sumDigit, sumOddDigit, maxDigit);
    }
}
