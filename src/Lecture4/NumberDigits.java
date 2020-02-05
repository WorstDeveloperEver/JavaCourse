package Lecture4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        int i = Math.abs(number);
        int digitsSum = 0;
        int oddDigitsSum = 0;
        int digitMax = 0;

        while (i > 0) {
            int digit = i % 10;

            digitsSum += digit;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            if (digitMax < digit) {
                digitMax = digit;
            }
            i /= 10;
        }

        System.out.printf("Sum digits = %d, Sum odd digits = %d, Max digit = %d", digitsSum, oddDigitsSum, digitMax);
    }
}
