import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements of `numbers`
        int[] numbers = new int[]{3, 4, 5, 6, 7};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("The sum of the elements of `numbers`: " + sum);
    }
}