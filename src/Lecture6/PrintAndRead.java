package Lecture6;

import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int a = printAndRead("Enter number:");

        String message = "Enter number:";
        int b = printAndRead(message);

        System.out.printf("Number a = %d, and number b = %d", a, b);
    }

    public static int printAndRead (String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();
    }
}
