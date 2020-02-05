package Lecture4;

public class NumbersInString {
    public static void main(String[] args) {
        int numberStart = 1;
        int numberEnd = 100;
        int numbersInStringCount = 25;

        int i = numberStart;
        int numbersPrintCount = 0;
        while (i <= numberEnd) {
            System.out.printf("%4d", i);

            numbersPrintCount++;
            if (numbersPrintCount % numbersInStringCount == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
