package Lecture8;

import java.util.Scanner;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String userString = scanner.nextLine();

        int digitsCount = 0;
        int lettersCount = 0;
        int spacesCount = 0;

        for (int i = 0; i < userString.length(); i++) {
            char symbol = userString.charAt(i);

            if (Character.isLetter(symbol)) {
                lettersCount++;
            } else if (Character.isDigit(symbol)) {
                digitsCount++;
            } else if (Character.isWhitespace(symbol)) {
                spacesCount++;
            }
        }

        int otherSymbolsCount = userString.length() - (digitsCount + lettersCount + spacesCount);
        System.out.printf("Letter = %d, Digits = %d, Spaces = %d, Symbols = %d", lettersCount, digitsCount, spacesCount, otherSymbolsCount);
    }
}
