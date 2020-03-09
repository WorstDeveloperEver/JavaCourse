package Lecture12;

public class SplitString {
    public static void main(String[] args) {
        String string = " 1, 2, 3, 4, 5 ";

        String[] numberString = string.trim().split(", ");

        int sum = 0;

        for (String s : numberString) {
            sum += Integer.parseInt(s);
        }
        System.out.println("Sum numbers in string = " + sum);
    }
}
