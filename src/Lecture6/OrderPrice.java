package Lecture6;

import java.util.Scanner;

public class OrderPrice {
    public static void main(String[] args) {
        int goods1Count = getGoodsCount("Enter the count of the first goods:");
        int goods2Count = getGoodsCount("Enter the count of the second goods:");

        double goods1Price = 150;
        double goods2Price = 90;

        double finalPrice = getFinalPrice(goods1Count, goods2Count, goods1Price, goods2Price);

        System.out.printf("Final price = %.2f rubles", finalPrice);
    }

    public static double getFinalPrice(int goods1Count, int goods2Count, double goods1Price, double goods2Price) {
        double goodsInOrderPrice = goods1Price * goods1Count + goods2Price * goods2Count;

        int discountValue = 5;
        int discountByCount = 10;
        int discountByPrice = 1000;

        int discountCount = ((goods1Count + goods2Count) >= discountByCount) ? discountValue : 0;
        double discountPrice = (goodsInOrderPrice >= discountByPrice) ? discountValue : 0;

        double discountFinal = (discountCount + discountPrice) / 100;

        return goodsInOrderPrice - goodsInOrderPrice * discountFinal;
    }

    public static int getGoodsCount(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        return scanner.nextInt();
    }
}
