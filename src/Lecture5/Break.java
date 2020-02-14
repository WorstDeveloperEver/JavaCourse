package Lecture5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String givenString = "Java";

        for (; ; ) {
            String userString = getUserString();

            if (userString.equals(givenString)) {
                System.out.println("Correct answer");
                break;
            }

            System.out.println("Wrong answer");
        }
    }

    private static String getUserString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the requested string:");
        return scanner.nextLine();
    }
}
