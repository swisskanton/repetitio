public class MaximumFinder {
    // Write a function which returns the largest element of an array using recursion.

    public static void main(String[] args) {
        int[] arr = new int[] {5, 12, 65, 47, 32, 69, 86, 52, 21, 34, 78, 29, 82};
        System.out.printf("Largest element is %d", largestElement(arr));
    }

    public static int largestElement(int[] arr) {
        return findMax(arr, 0, arr[0]);
    }

    public static int findMax(int[] arr, int count, int max) {
        if (++count <  arr.length) {
            if (max < arr[count])
                max = arr[count];
        } else
            return max;
        return findMax(arr, count, max);
    }
}
