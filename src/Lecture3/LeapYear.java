package Lecture3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = scanner.nextInt();

        if (year <= 0) {
            System.out.println("Wrong year");
        } else if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Year is not a leap");
        } else {
            System.out.println("Leap year");
        }
    }
}
