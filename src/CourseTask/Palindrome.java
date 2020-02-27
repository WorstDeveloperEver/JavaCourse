package CourseTask;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String userString = scanner.nextLine();

        if (isNoLettersString(userString)) {
            System.out.println("Wrong string, there is no letters");
            return;
        }

        System.out.printf("Is palindrome? %b", isPalindrome(userString));
    }

    private static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) {
            char compareChar = string.charAt(i);

            while (!Character.isLetter(compareChar)) {
                compareChar = string.charAt(i + 1);
                i++;
            }

            char leftChar = compareChar;

            compareChar = string.charAt(j);

            while (!Character.isLetter(compareChar)) {
                compareChar = string.charAt(j - 1);
                j--;
            }

            char rightChar = compareChar;

            if (i == j) {
                return true;
            }

            if (leftChar != rightChar) {
                return false;
            }
        }

        return true;
    }

    private static boolean isNoLettersString(String string) {
        char[] array = string.toCharArray();

        for (char value : array) {
            if (Character.isLetter(value)) {
                return false;
            }
        }

        return true;
    }
}
