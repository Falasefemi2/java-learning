import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition: " +  (num1 + num2));
        System.out.println("Subtraction: " +  (num1 - num2));
        System.out.println("Multiplication: " +  (num1 * num2));
        System.out.printf("Division: %.2f\n", (double) num1 / num2);
        System.out.println("Modulus: " + (num1 % num2));


        input.close();
    }
}
