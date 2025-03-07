import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        // Get user input
        System.out.print("Enter a temperature in Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9 /5 + 32);

        System.out.printf("%.2f C = %.2f F", celsius, fahrenheit);

        input.close();
    }
}
