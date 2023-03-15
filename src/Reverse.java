import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]
        int[] numbers = new int[]{3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}