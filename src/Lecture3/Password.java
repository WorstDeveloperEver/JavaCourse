package Lecture3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password:");
        String userPassword = scanner.nextLine().trim();

        String correctPassword = "Java";

        if (userPassword.equals(correctPassword)) {
            System.out.println("Correct password");
        } else if (userPassword.length() > correctPassword.length()) {
            System.out.println("Wrong password, too many characters");
        } else if (userPassword.length() < correctPassword.length()) {
            System.out.println("Wrong password, too few characters");
        } else {
            System.out.println("Wrong password");
        }
    }
}
