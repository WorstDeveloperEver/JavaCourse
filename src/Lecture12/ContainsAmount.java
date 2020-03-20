package Lecture12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContainsAmount {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        String searchString = "jAvA";

        try (Scanner scanner = new Scanner(new FileInputStream("./src/Files/text.txt"))) {
            while (scanner.hasNextLine()) {
                count += getNumbersEntries(scanner.nextLine(), searchString);
            }
        }

        System.out.println("The number of includes of the string in the file = " + count);
    }

    public static int getNumbersEntries(String string, String searchString) {
        int count = 0;
        int i = 0;
        int searchPosition = -1;
        string = string.toLowerCase();
        searchString = searchString.toLowerCase();

        while (i != -1) {
            i = string.indexOf(searchString, searchPosition + 1);
            searchPosition = i;

            if (i != -1) {
                count++;
            }
        }

        return count;
    }
}
