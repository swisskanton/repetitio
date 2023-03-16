import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input
        //
        // - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("The factorial of %d is: %d", number, calculateFactorial(number));
    }

    public static int calculateFactorial(int number) {
        int factor = 1;
        for (int i = 1; i <= number; i++) {
            factor *= i;
        }
        return factor;
    }
}
