import java.util.Scanner;

public class SumDigits {
    // Given a non-negative integer n, return the sum of its digits recursively
    // (without loops).
    //
    // Hint
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("The sum of digits: %d", sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        if (number == 0)
            return 0;
        else
            return number % 10 + sumOfDigits(number / 10);
    }
}
