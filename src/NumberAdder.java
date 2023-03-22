import java.util.Scanner;

public class NumberAdder {
    // Implement "numberAdder" which is a recursive function that takes one parameter: n (number)
    // and returns the sum of integers from 1 to n.
    // The function should return 0 for inputs less than 1.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println(numberAdder(number));
    }

    public static int numberAdder(int number) {
        if (number < 1)
            return 0;
        else
            return number + numberAdder(number - 1);
    }
}
