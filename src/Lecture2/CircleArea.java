package Lecture2;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Lecture2.Circle area is %.2f ", area);
    }
}
