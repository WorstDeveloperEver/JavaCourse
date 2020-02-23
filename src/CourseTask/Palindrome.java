package CourseTask;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String userString = scanner.nextLine();

        System.out.printf("Is palindrome? %b", isPalindrome(userString));
    }

    private static boolean isPalindrome(String userString) {
        userString = userString.toLowerCase();

        for (int i = 0, j = userString.length() - 1; i < userString.length() / 2; i++, j--) {
            char charCurrent = userString.charAt(i);

            while (!Character.isLetter(charCurrent)) {
                charCurrent = userString.charAt(i + 1);
                i++;
            }

            char charToCompare = userString.charAt(j);

            while (!Character.isLetter(charToCompare)) {
                charToCompare = userString.charAt(j - 1);
                j--;
            }

            if (i == j) {
                return true;
            }

            if (charCurrent != charToCompare) {
                return false;
            }
        }

        return true;
    }
}
