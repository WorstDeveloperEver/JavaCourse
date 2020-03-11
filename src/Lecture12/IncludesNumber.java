package Lecture12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IncludesNumber {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;

        try (Scanner scanner = new Scanner(new FileInputStream("./src/Files/text.txt"))) {
            while (scanner.hasNextLine()) {
                count += getContainsCount(scanner.nextLine(), "jAvA");
            }
        }

        System.out.println("The number of includes of the Java string in the file = " + count);
    }

    public static int getContainsCount(String string, String searchString) {
        int count = 0;
        int i = 0;
        searchString = searchString.toLowerCase();

        while (true) {
            int left = i;
            int right = string.indexOf(" ", i);

            if (right < left) {
                String compareString = string.substring(left).toLowerCase();

                if (compareString.contains(searchString)) {
                    count++;
                }
                break;
            }

            String compareString = string.substring(left, right).toLowerCase();

            if (compareString.contains(searchString)) {
                count++;
            }

            if (right == string.length()) {
                break;
            }

            i = right + 1;
        }
        return count;
    }
}
