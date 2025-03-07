import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int playerNum;
        // Pick a random number
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        playerNum = scanner.nextInt();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("The number i was thinking of  is :" + number);
        System.out.printf("You were off by: %d", number - playerNum);

        scanner.close();
    }
}
