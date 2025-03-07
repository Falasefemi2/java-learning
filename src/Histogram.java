import java.util.Random;

public class Histogram {

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] scores = randomArray(30);
        int[] ranges = { 0, 60, 70, 80, 90, 100 };
        int[] histogram = new int[ranges.length - 1];

        for (int i = 0; i < histogram.length; i++) {
            histogram[i] = inRange(scores, ranges[i], ranges[i + 1]);
        }

        System.out.println("Histogram:");
        for (int i = 0; i < histogram.length; i++) {
            System.out.println("Range " + ranges[i] + "-" + ranges[i + 1] + ": " + histogram[i]);
        }
    }
}

// public class Histogram {

// public static int[] randomArray(int size) {
// Random random = new Random();
// int[] a = new int[size];
// for (int i = 0; i < a.length; i++) {
// a[i] = random.nextInt(100);
// }
// return a;
// }

// public static int inRange(int[] a, int low, int high) {
// int count = 0;
// for (int i = 0; i < a.length; i++) {
// if (a[i] >= low && a[i] < high) {
// count++;
// }
// }
// return count;
// }

// public static void main(String[] args) {
// int[] scores = randomArray(30);
// int a = inRange(scores, 90, 100);
// int b = inRange(scores, 80, 90);
// int c = inRange(scores, 70, 80);
// int d = inRange(scores, 60, 70);
// int e = inRange(scores, 0, 60);

// System.err.println(a);
// System.err.println(b);
// System.err.println(c);
// System.err.println(d);
// System.err.println(e);
// }
// }
