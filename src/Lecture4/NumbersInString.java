package Lecture4;

public class NumbersInString {
    public static void main(String[] args) {
        int numberStart = 1;
        int numberEnd = 100;
        int numbersInStringCount = 25;

        int i = numberStart;
        int j = 0;
        while (i <= numberEnd) {
            System.out.printf("%4d", i);

            j++;
            if (j % numbersInStringCount == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
