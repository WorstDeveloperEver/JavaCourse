package CourseTask;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a = getNumber("a");
        double b = getNumber("b");
        double c = getNumber("c");

        // Случаи когда уравнение не является квадратным
        double epsilon = 1.0e-10;

        if ((Math.abs(a) <= epsilon) && (Math.abs(b) <= epsilon) && (Math.abs(c) <= epsilon)) {
            System.out.println("Answer: x1 = 1; x2 = 0/0");
            return;
        }
        if ((Math.abs(a) <= epsilon) && (Math.abs(b) <= epsilon)) {
            System.out.println("No solution");
            return;
        }
        if (Math.abs(a) <= epsilon) {
            double x = -c / b;

            System.out.printf("Answer: x = %.2f", x);
            return;
        }

        // Решаем квадратное уравнение
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (Math.abs(discriminant) <= epsilon) {
            double x = -b / (2 * a);

            System.out.printf("Answer: x = %.2f", x);
        } else if (discriminant > epsilon) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("Answer: x = %.2f; x2 = %.2f", x1, x2);
        } else {
            System.out.println("No solution");
        }
    }

    private static double getNumber(String userMustEnter) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter number %s:%n", userMustEnter);
        return scanner.nextDouble();
    }
}
