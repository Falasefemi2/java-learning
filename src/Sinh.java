public class Sinh {
    // Method to compute factorial
    public static double factorial(int num) {
        double fact = 1.0;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to compute sinh(x) using series expansion
    public static double sinhSeries(double x, int n) {
        double sum = 0.0;

        for (int k = 0; k < n; k++) {
            int exponent = 2 * k + 1; // (2k + 1)
            int factIndex = exponent; // (2k + 1)!

            sum += Math.pow(x, exponent) / factorial(factIndex);
        }

        return sum;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        double result = sinhSeries(x, n);
        System.out.println(result);

    }
}
