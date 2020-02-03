package Lecture4;

public class NumbersInString {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 100;
        int numbersInString = 25;

        int i = startNumber;
        int j = 0;
        while (i <= endNumber) {
            System.out.printf("%4d", i);

            j++;
            if (j % numbersInString == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
