package Lecture8;

import java.util.Scanner;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String userString = scanner.nextLine();

        int numbersCount = 0;
        int charsCount = 0;
        int spacesCount = 0;

        for (int i = 0; i < userString.length(); i++) {
            char symbol = userString.charAt(i);

            if (Character.isLetter(symbol)) {
                charsCount++;
            }
            if (Character.isDigit(symbol)) {
                numbersCount++;
            }
            if (Character.isWhitespace(symbol)) {
                spacesCount++;
            }
        }

        int symbolsCount = userString.length() - (numbersCount + charsCount + spacesCount);

        System.out.printf("Chars = %d, Numbers = %d, Spaces = %d, Symbols = %d", charsCount, numbersCount, spacesCount, symbolsCount);
    }
}
