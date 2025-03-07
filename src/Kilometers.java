import java.util.Scanner;

public class Kilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        // Store the user input
        double Kilometers = input.nextDouble();
        double miles = Kilometers * 0.621371;
        System.out.printf("%.2f km = %.2f miles\n", Kilometers, miles);

        input.close();
    }
}
