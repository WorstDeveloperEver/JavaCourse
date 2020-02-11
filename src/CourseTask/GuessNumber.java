package CourseTask;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int guessedNumber = random.nextInt(100) + 1;
        int userNumber;
        int attemptCount = 0;

        do {
            userNumber = getUserNumber();
            attemptCount++;

            if (userNumber == guessedNumber) {
                System.out.print("Correct answer, ");
                break;
            } else if (userNumber < guessedNumber) {
                System.out.println("Less than the guessed number");
            } else {
                System.out.println("Greater than the guessed number");
            }

        } while (true);

        System.out.print("attempt count = " + attemptCount);
    }

    private static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        return scanner.nextInt();
    }
}
