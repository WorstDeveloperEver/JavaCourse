package Lecture6;

import java.util.Scanner;

public class OrderPrice {
    public static void main(String[] args) {
        int goodsFirstCount = getGoodsCount("Enter the count of the first goods:");
        int goodsSecondCount = getGoodsCount("Enter the count of the second goods:");

        int goodsInOrderCount = goodsFirstCount + goodsSecondCount;

        int goodsFirstPrice = 150;
        int goodsSecondPrice = 90;

        int goodsInOrderPrice = goodsFirstPrice * goodsFirstCount + goodsSecondPrice * goodsSecondCount;

        double finalPrice = getFinalPrice(goodsInOrderPrice, getDiscount(goodsInOrderCount, goodsInOrderPrice));

        System.out.printf("Final price = %.2f rubles", finalPrice);
    }

    public static double getDiscount(int goodsInOrderCount, int goodsInOrderPrice) {
        if (goodsInOrderCount >= 10 && goodsInOrderPrice >= 1000) {
            return 10;
        }

        if ((goodsInOrderCount >= 10 || goodsInOrderPrice >= 1000)) {
            return 5;
        }

        return 0;
    }

    public static double getFinalPrice(int goodsInOrderPrice, double discount) {
        return goodsInOrderPrice * (100 - discount) / 100;
    }

    public static int getGoodsCount(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();
    }
}
