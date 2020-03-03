package CourseTask;

import java.util.Scanner;

public class MaxSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String userString = scanner.nextLine();

        System.out.printf("Max substring length = %d", getMaxSubstringLength(userString));
    }

    private static int getMaxSubstringLength(String userString) {
        if (userString.length() == 1) {
            return 1;
        }

        userString = userString.toLowerCase();

        int maxSubstringLength = 0;
        int equalCharsCount = 1;

        for (int i = 0; i < userString.length() - 1; i++) {
            char currentChar = userString.charAt(i);
            char nextChar = userString.charAt(i + 1);

            if (currentChar == nextChar) {
                equalCharsCount++;
            } else {
                equalCharsCount = 1;
            }

            if (equalCharsCount > maxSubstringLength) {
                maxSubstringLength = equalCharsCount;
            }
        }

        return maxSubstringLength;
    }
}
