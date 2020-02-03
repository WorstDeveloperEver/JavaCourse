package CourseTask;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        int day = readNumberFromConsole("day");
        int month = readNumberFromConsole("month");
        int year = readNumberFromConsole("year");

        // Определяем количество дней в месяце
        int daysInMonthCount;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonthCount = 31;
                break;
            case 2:
                if (isNotLeapYear(year)) {
                    daysInMonthCount = 28;
                } else {
                    daysInMonthCount = 29;
                }
                break;
            default:
                daysInMonthCount = 30;
        }

        // Проверяем корректность даты
        if (day > daysInMonthCount || (month > 12 || year <= 0 || month <= 0 || day <= 0)) {
            System.out.println("Wrong date");
            return;
        }

        // Прибавляем день
        if (day == daysInMonthCount && month == 12) {
            System.out.printf("Next day: 01.01.%04d", year + 1);
        } else if (day == daysInMonthCount) {
            System.out.printf("Next day: 01.%02d.%04d", month + 1, year);
        } else {
            System.out.printf("Next day: %02d.%02d.%04d", day + 1, month, year);
        }
    }

    private static int readNumberFromConsole(String userMustEnter) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter %s:%n", userMustEnter);
        return scanner.nextInt();
    }

    private static boolean isNotLeapYear(int year){
        return year % 4 != 0 || (year % 100 == 0 && year % 400 != 0);
    }
}
