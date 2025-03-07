import java.util.Random;
import java.util.Scanner;

public class AnotherGuessGame {
    public static void main(String[] args) {
        int guess;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        while (true) {
            System.err.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("Too high! Try again");
            } else if (guess < number) {
                System.out.println("Too low! Try again");
            } else {
                System.out.println("Correct! You guessed right.");
                break;
            }
        }

        scanner.close();
    }
}
