package CourseTask;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int guessedNumber = random.nextInt(100) + 1;
        int attemptsCount = 0;

        System.out.println("Computer picks up a random number, try to guess.");

        for (; ; ) {
            int userNumber = getUserNumber();
            attemptsCount++;

            if (userNumber == guessedNumber) {
                break;
            }

            if (userNumber < guessedNumber) {
                System.out.println("Less than the guessed number");
            } else {
                System.out.println("Greater than the guessed number");
            }
        }

        System.out.print("Correct answer, attempt count = " + attemptsCount);
    }

    private static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        return scanner.nextInt();
    }
}
