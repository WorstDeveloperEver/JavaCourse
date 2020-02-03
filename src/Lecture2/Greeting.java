package Lecture2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you name?");
        String name = scanner.nextLine();

        System.out.printf("Hi, %s!", name);
    }
}
