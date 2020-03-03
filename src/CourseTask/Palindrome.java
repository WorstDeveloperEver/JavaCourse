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

        int stringMiddle = string.length() / 2;
        for (int i = 0, j = string.length() - 1; i < stringMiddle; i++, j--) {
            while (!Character.isLetter(string.charAt(i))) {
                i++;
                if (i == j) {
                    return false;
                }
            }

            while (!Character.isLetter(string.charAt(j))) {
                j--;
            }

            if (i == j) {
                return true;
            }

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
