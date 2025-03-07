public class SqaureRoot {

    public static double squareRoot(double a) {
        if (a < 0) {
            System.err.println("Cannot compute square root of a negative number.");
        }
        if (a == 0) {
            return 0;
        }

        double x0 = a / 2;
        double x1;

        while (true) {
            x1 = (x0 + a / x0) / 2;

            if (Math.abs(x1 - x0) < 0.0001) {
                break;
            }
            x0 = x1;
        }

        return x1;

    }

    public static void main(String[] args) {
        double num = 16;
        double result = squareRoot(num);
        System.out.println("Approximate sqaure root of " + num + " is: " + result);
    }
}
