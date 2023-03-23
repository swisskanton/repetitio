import java.util.Arrays;

public class MaxSum {
    // Create a function called `maxSum` which
    // expects an array of five integers as an input parameter and
    // returns the maximum values that can be
    // calculated by summing exactly four of the five integers.
    //
    // Examples
    //
    // [1 2 3 4 5] -> 14
    //
    // We can calculate the following sums using four of the five integers:
    //
    // 1 + 2 + 3 + 4 = 10
    // 1 + 2 + 3 + 5 = 11
    // 1 + 2 + 4 + 5 = 12
    // 1 + 3 + 4 + 5 = 13
    // 2 + 3 + 4 + 5 = 14

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {10, 20, 30, 40, 50};
        int[] arr3 = new int[] {22, 34, 78, 29, 82};
        System.out.printf("The maximum calculated sum of %s is %d\n", Arrays.toString(arr1), maxSum(arr1));
        System.out.printf("The maximum calculated sum of %s is %d\n", Arrays.toString(arr2), maxSum(arr2));
        System.out.printf("The maximum calculated sum of %s is %d\n", Arrays.toString(arr3), maxSum(arr3));
    }

    public static int maxSum(int[] arr) {
        return getMax(arr, 0, arr[0]);
    }

    public static int getMax(int[] arr, int count, int max) {
        if (count < arr.length) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += (i == count) ? 0 : arr[i];
            }
            if (max < sum)
                max = sum;
        } else return max;
        return getMax(arr, count + 1, max);
    }
}
