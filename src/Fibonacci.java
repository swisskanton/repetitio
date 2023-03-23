import java.util.Scanner;

public class Fibonacci {
    // The fibonacci sequence is a famous bit of mathematics,
    // and it happens to have a recursive definition.
    // The first two values in the sequence are 0 and 1 (essentially 2 base cases).
    // Each subsequent value is the sum of the previous two values,
    // so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    // Define a recursive fibonacci(n) method that
    // returns the nth fibonacci number,
    // with n=0 representing the start of the sequence.
    // The method should be able to handle invalid input (e.g. negative numbers)

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("The %dth fibonacci number is %d", number, fibonacci(number - 1));
    }

    public static int fibonacci(int number) {
        if (number < 1)
            return 0;
        else if (number == 1)
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);

    }
}
