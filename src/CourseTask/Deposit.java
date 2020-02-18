package CourseTask;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        double depositPeriodInMonths = getUserNumber("deposit period in months");
        double depositAmount = getUserNumber("deposit amount");
        double percent = getUserNumber("percent") / 100;
        double depositAfterPeriod = depositAmount;

        for (int i = 0; i < depositPeriodInMonths; i++) {
            double depositProfitInMonth = depositAfterPeriod * percent / 12;
            depositAfterPeriod += depositProfitInMonth;
        }

        double depositProfit = depositAfterPeriod - depositAmount;

        System.out.printf("Deposit amount after period = %.2f, profit = %.2f", depositAfterPeriod, depositProfit);
    }

    public static double getUserNumber (String message){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter %s: ", message);
        return scanner.nextDouble();
    }
}
