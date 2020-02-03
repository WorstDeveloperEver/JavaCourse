package Lecture3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int maxInt = Math.max(firstNumber, secondNumber);
        int mixInt = Math.min(firstNumber, secondNumber);

        System.out.printf("Max = %d, Min = %d", maxInt, mixInt);
    }
}
