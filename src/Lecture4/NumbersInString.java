package Lecture4;

public class NumbersInString {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 100;
        int numbersInStringCount = 25;

        int i = startNumber;
        int printedNumbersCount = 0;

        while (i <= endNumber) {
            System.out.printf("%4d", i);

            printedNumbersCount++;

            if (printedNumbersCount % numbersInStringCount == 0) {
                System.out.println();
            }

            i++;
        }
    }
}
