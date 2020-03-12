package Lecture10;

import java.util.Scanner;

public class EuclideanAlgorithmRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();

        System.out.println("Enter b:");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Wrong input");
            return;
        }

        System.out.println("Largest common divider: " + getGreatestCommonDivisor(a, b));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGreatestCommonDivisor(b, a % b);
    }
}
