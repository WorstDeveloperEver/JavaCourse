package CourseTask;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        int depositPeriodInMonths = getDepositPeriodInMonths("deposit period in months");
        double depositAmount = getUserNumber("deposit amount");

        final int oneHundred = 100;
        final int monthInYearCount = 12;
        double percent = getUserNumber("percent") / (oneHundred * monthInYearCount);

        double depositAfterPeriod = depositAmount;

        for (int i = 0; i < depositPeriodInMonths; i++) {
            depositAfterPeriod += depositAfterPeriod * percent;
        }

        double depositProfit = depositAfterPeriod - depositAmount;
        System.out.printf("Deposit amount after period = %.2f, profit = %.2f", depositAfterPeriod, depositProfit);
    }

    public static double getUserNumber(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter %s: ", message);
        return scanner.nextDouble();
    }

    public static int getDepositPeriodInMonths(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter %s: ", message);
        return scanner.nextInt();
    }
}
