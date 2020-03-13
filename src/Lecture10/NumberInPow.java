package Lecture10;

public class NumberInPow {
    public static void main(String[] args) {
        int power = 6;
        int number = 5;

        System.out.printf("Number %d in power %d = %d%n", number, power, powRecursion(number, power));
        System.out.printf("Number %d in power %d = %d", number, power, pow(number, power));
    }

    public static int powRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return number * powRecursion(number, power - 1);
    }

    public static int pow(int number, int power) {
        int numberInPow = 1;

        for (int i = 0; i < power; i++) {
            numberInPow *= number;
        }

        return numberInPow;
    }
}
