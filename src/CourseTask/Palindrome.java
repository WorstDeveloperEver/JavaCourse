package CourseTask;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String userString = scanner.nextLine();

        System.out.printf("Is palindrome? %b", isPalindrome(userString));
    }

    private static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        int left = 0;
        int right = string.length() - 1;

        while (left <= right) {
            while (!Character.isLetter(string.charAt(left))) {
                left++;
                if (left == right) {
                    return true;
                }
            }

            while (!Character.isLetter(string.charAt(right))) {
                right--;
            }

            if (left == right) {
                return true;
            }

            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
