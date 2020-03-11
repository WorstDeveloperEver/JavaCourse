package Lecture12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter("./src/Files/Result.txt");
             Scanner scanner = new Scanner(new FileInputStream("./src/Files/text.txt"))) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}
