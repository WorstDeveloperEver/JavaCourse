package Lecture2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Enter length and width");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.printf("Area = %.2f, perimeter = %.2f",x*y,2*(x+y));
    }
}
