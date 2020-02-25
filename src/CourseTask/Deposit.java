package CourseTask;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit period in months:");
        int depositPeriodInMonths = scanner.nextInt();

        System.out.print("Enter deposit amount:");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter percent:");
        double percent = scanner.nextDouble();

        final int oneHundred = 100;
        final int monthsInYearCount = 12;
        double percentPerMonth = percent / (oneHundred * monthsInYearCount);

        double depositAfterPeriod = depositAmount;

        for (int i = 0; i < depositPeriodInMonths; i++) {
            depositAfterPeriod += depositAfterPeriod * percentPerMonth;
        }

        double depositProfit = depositAfterPeriod - depositAmount;
        System.out.printf("Deposit amount after period = %.2f, profit = %.2f", depositAfterPeriod, depositProfit);
    }
}
