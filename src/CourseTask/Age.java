package CourseTask;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст от 1 до 112:");
        int age = scanner.nextInt();

        // Проверяем корректность ввода
        if (age < 1) {
            System.out.println("Вы слишком малы");
            return;
        }
        if (age > 112) {
            System.out.println("Вы слишком стары");
            return;
        }

        // Учитываем склонение чисел
        if (age / 10 == 1 || (age % 100 > 10 && age % 100 < 20)) {
            System.out.printf("Вам %d лет", age);
            return;
        }

        switch (age % 10) {
            case 1:
                System.out.printf("Вам %d год", age);
                break;
            case 2:
            case 3:
            case 4:
                System.out.printf("Вам %d года", age);
                break;
            default:
                System.out.printf("Вам %d лет", age);
                break;
        }
    }
}
