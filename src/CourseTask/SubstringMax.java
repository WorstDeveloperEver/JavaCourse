package CourseTask;

import java.util.Scanner;

public class SubstringMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String userString = scanner.nextLine();

        System.out.printf("Max substring length = %d", getSubstringMaxLength(userString));
    }

    private static int getSubstringMaxLength(String userString) {
        userString = userString.toLowerCase();

        int substringMaxLength = 0;
        int charsEqualCount = 1;

        for (int i = 0; i < userString.length() - 1; i++) {
            char charCurrent = userString.charAt(i);
            char charNext = userString.charAt(i + 1);

            if (charCurrent == charNext) {
                charsEqualCount++;
            } else {
                charsEqualCount = 1;
            }

            if (charsEqualCount > substringMaxLength) {
                substringMaxLength = charsEqualCount;
            }
        }

        return substringMaxLength;
    }
}
