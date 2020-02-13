package CourseTask;

public class Deposit {
    public static void main(String[] args) {
        int depositPeriodInMonths = 12;
        double depositAmount = 100000;
        double depositProfitInMonth;
        double percent = 0.06;
        double depositAfterPeriod = depositAmount;

        for (int i = 0; i < depositPeriodInMonths; i++) {
            depositProfitInMonth = depositAfterPeriod * percent / depositPeriodInMonths;
            depositAfterPeriod = depositAfterPeriod + depositProfitInMonth;
        }

        System.out.printf("Deposit amount after period = %.2f, profit = %.2f", depositAfterPeriod, depositAfterPeriod - depositAmount);
    }
}
