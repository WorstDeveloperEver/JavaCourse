package Lecture4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int numberA = getNumber("number A");
        int numberB = getNumber("number B");
        int commandNumber = getNumber("1 to summarize, 2 to subtract, 3 to multiply, 4 to divide");

        switch (commandNumber) {
            case 1:
                System.out.printf("%d + %d = %d", numberA, numberB, numberA + numberB);
                break;
            case 2:
                System.out.printf("%d - %d = %d", numberA, numberB, numberA - numberB);
                break;
            case 3:
                System.out.printf("%d * %d = %d", numberA, numberB, numberA * numberB);
                break;
            case 4:
                System.out.printf("%d / %d = %.1f", numberA, numberB, (double) numberA / numberB);
                break;
            default:
                System.out.println("Wrong command");
                break;
        }
    }

    private static int getNumber(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter %s:%n", message);
        return scanner.nextInt();
    }
}
