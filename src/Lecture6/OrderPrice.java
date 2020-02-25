package Lecture6;

import java.util.Scanner;

public class OrderPrice {
    public static void main(String[] args) {
        int goods1Count = getUserNumber("Enter the count of the first goods:");
        int goods2Count = getUserNumber("Enter the count of the second goods:");

        final double goods1Price = 150;
        final double goods2Price = 90;

        double finalPrice = getOrderValue(goods1Count, goods1Price, goods2Count, goods2Price);
        System.out.printf("Final price = %.2f rubles", finalPrice);
    }

    public static double getOrderValue(int goods1Count, double goods1Price, int goods2Count, double goods2Price) {
        double orderPrice = goods1Price * goods1Count + goods2Price * goods2Count;

        final double discountValuePercent = 0.05;
        final int goodsForDiscountCount = 10;
        final int priceForDiscount = 1000;

        double countDiscount = ((goods1Count + goods2Count) >= goodsForDiscountCount) ? discountValuePercent : 0;
        double priceDiscount = (orderPrice >= priceForDiscount) ? discountValuePercent : 0;

        double finalDiscountPercent = countDiscount + priceDiscount;

        return orderPrice - orderPrice * finalDiscountPercent;
    }

    public static int getUserNumber(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();
    }
}
