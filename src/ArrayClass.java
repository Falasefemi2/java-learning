import java.util.Arrays;

public class ArrayClass {

    public static int search(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] traversal(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        double[] array = { 3.14, -44.0, 1.33, -0.3 };
        int index = search(array, 3.14);
        System.out.println(index);

        int[] a = { 1, 2, 3, 4 };
        int[] answer = traversal(a);
        System.out.println(Arrays.toString(answer));
    }
}
