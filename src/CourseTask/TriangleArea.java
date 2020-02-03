package CourseTask;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double x1 = getNumber("x1");
        double y1 = getNumber("y1");
        double x2 = getNumber("x2");
        double y2 = getNumber("y2");
        double x3 = getNumber("x3");
        double y3 = getNumber("y3");

        // Проверяем случай, когда все точки на одной линии
        double epsilon = 1.0e-10;
        if (Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) < epsilon) {
            System.out.println("All point on one line");
            return;
        }

        // Вычисляем площадь треугольника
        double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        double halfPerimeter = (a + b + c) / 2;

        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        System.out.printf("Triangle area: %.2f", triangleArea);
    }

    private static double getNumber(String number) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter number %s:%n", number);
        return scanner.nextDouble();
    }
}