import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double interest = input.nextDouble();
        System.out.print("Enter time in year: ");
        int year = input.nextInt();

        double simpleInterest = (principal * interest * year) / 100;

        System.out.printf("Simple Interest = %.2f\n", simpleInterest);

        input.close();
    }
}
