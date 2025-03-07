public class Expo {

    public static double guess(double x, double n) {
        double sum = 1.0; // First terms is always 1
        double terms = 1.0; // This keeps track of each terms
        for (int k = 1; k < n; k++) {
            // Update the term using the recurrence relation
            terms *= (-x * x) / k;

            // Add the term to the sum
            sum += terms;
        }
        return sum;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 3;
        double value = guess(x, n);
        System.out.println(value);
    }
}
