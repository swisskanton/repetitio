import java.util.Scanner;

public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears. Write
    // a recursive method (no loops or multiplication) which takes the number of
    // bunnies as its sole parameter and returns the total number of ears
    // the bunnies have. The method should be able to handle invalid input
    // (e.g. negative numbers)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of bunnies: ");
        int numberOfBunnies = scanner.nextInt();
        System.out.printf("The number of ears: %d", numberOfEars(numberOfBunnies));
    }

    public static int numberOfEars(int number) {
        if (number < 1)
            return 0;
        else
            return 2 + numberOfEars(number - 1);
    }
}