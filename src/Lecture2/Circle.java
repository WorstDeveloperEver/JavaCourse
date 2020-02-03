package Lecture2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // Расчёт площади круга и длинны окружности по радиусу

        double radius = readNumber("Enter radius:");

        double circleArea = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Lecture2.Circle area = %.2f %nCircumference = %.2f%n%n", circleArea, circumference);

        // Расчёт радиуса по площади

        circleArea = readNumber("Enter area:");

        radius = Math.sqrt(circleArea / Math.PI);

        System.out.printf("Lecture2.Circle radius = %.2f%n%n", radius);

        // Площадь сектора

        double angle = Math.toRadians(readNumber("Enter angle (degrees):"));

        radius = readNumber("Enter radius:");

        double sectorArea = angle / 2 * Math.pow(radius, 2);
        System.out.printf("Sector area = %.2f", sectorArea);
    }

    private static double readNumber(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(string);
        return scanner.nextDouble();
    }
}
