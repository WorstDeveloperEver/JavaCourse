package Lecture6;

import java.util.Scanner;

public class OrderPrice {
    public static void main(String[] args) {
        int goods1Count = getGoodsCount("Enter the count of the first goods:");
        int goods2Count = getGoodsCount("Enter the count of the second goods:");

        double goods1Price = 150;
        double goods2Price = 90;

        double finalPrice = getFinalPrice(goods1Count, goods1Price, goods2Count, goods2Price);
        System.out.printf("Final price = %.2f rubles", finalPrice);
    }

    public static double getFinalPrice(int goods1Count, double goods1Price, int goods2Count, double goods2Price) {
        double goodsInOrderPrice = goods1Price * goods1Count + goods2Price * goods2Count;

        int discountValue = 5;
        int goodsForDiscount = 10;
        int priceForDiscount = 1000;

        int discountFromCount = ((goods1Count + goods2Count) >= goodsForDiscount) ? discountValue : 0;
        double discountFromPrice = (goodsInOrderPrice >= priceForDiscount) ? discountValue : 0;

        double finalDiscount = (discountFromCount + discountFromPrice) / 100;

        return goodsInOrderPrice - goodsInOrderPrice * finalDiscount;
    }

    public static int getGoodsCount(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();
    }
}
