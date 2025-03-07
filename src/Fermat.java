public class Fermat {

    // Method to check Fermat's theorem
    public static boolean checkFermat(double a, double b, double c, double n) {
        if (n <= 2) {
            System.out.println("Fermat's Last Theorem only applies for n > 2");
            return false;
        }

        // Compute powers
        double leftSide = Math.pow(a, n) + Math.pow(b, n);
        double rightSide = Math.pow(c, n);

        // Use a small epsilon value for floating point comparison
        double epsilon = 1e-9;
        return Math.abs(leftSide - rightSide) < epsilon;
    }

    public static void main(String[] args) {
        double a = -3, b = -4, c = -5, n = 3;

        if (checkFermat(a, b, c, n)) {
            System.out.println("This contradicts Fermat's Last Theorem");
        } else {
            System.out.println("Fermat's Last Theorem holds");
        }
    }
}