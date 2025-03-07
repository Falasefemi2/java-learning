import java.util.Arrays;
import java.util.Random;

public class App {

    public static int search(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static double sum(double[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < a.length; i++) {
            int ans = a[i] *= a[i];
            System.out.println(ans);
        }

        double[] array = { 3.14, -55.0, 1.23, -0.8 };
        int index = search(array, 3.14);
        System.out.println(index);
        double ans = sum(array);
        System.out.println(ans);

        int[] see = randomArray(8);
        System.out.println(Arrays.toString(see));
    }
}