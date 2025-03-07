import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        // Input validation for integers

        try {
            System.out.print("Enter value of a: ");
            a = input.nextInt();
            System.out.print("Enter value of b: ");
            b = input.nextInt();
            System.out.print("Enter value of c: ");
            c = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integer only");
            return;
        }

        // Check if a is zero
        if (a == 0) {
            System.out.println("Invalid input: 'a' cannot be zero. This is not a quadratic equation.");
            return;
        }

        // calculate the discriminant
        int discriminant = (b * b) - (4 * a * c);

        // check if discriminant is negative
        if (discriminant < 0) {
            System.out.println("No real roots. The discriminant is negative.");
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2.0 / a);
            System.out.println("This is one  real  root: " + root);
        } else {
            // Two real root
            double root1 = (-b + Math.sqrt(discriminant) / (2.0 * a));
            double root2 = (-b - Math.sqrt(discriminant) / (2.0 * a));
            System.out.println("Two real roots: " + root1 + " and " + root2);
        }
        input.close();
    }
}