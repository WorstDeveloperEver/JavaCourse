package Lecture5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String answer = "Java";
        String userString;

        do {
            userString = getUserString();

            if (userString.equals(answer)) {
                System.out.println("Correct answer");
                break;
            } else {
                System.out.println("Wrong answer");
            }

        } while (true);
    }

    private static String getUserString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the requested string:");
        return scanner.nextLine();
    }
}
