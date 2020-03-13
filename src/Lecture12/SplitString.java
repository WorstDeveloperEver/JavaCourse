package Lecture12;

public class SplitString {
    public static void main(String[] args) {
        String string = " 1, 2, 3, 4, 5 ";

        String[] numbersString = string.trim().split(", ");

        int sum = 0;

        for (String s : numbersString) {
            sum += Integer.parseInt(s);
        }

        System.out.println("Sum numbers in string = " + sum);
    }
}
