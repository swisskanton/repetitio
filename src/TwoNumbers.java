import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22

        // Print the result of 13 substracted from 22

        // Print the result of 22 multiplied by 13

        // Print the result of 22 divided by 13 (as a decimal fraction)

        // Print the integer part of 22 divided by 13

        // Print the remainder of 22 divided by 13
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an integer number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter an other integer number:");
        int secondNumber = scanner.nextInt();
        int intResult = firstNumber + secondNumber;
        System.out.println("The result of " + firstNumber + " added " + secondNumber + " is equal to " + intResult);
        intResult = firstNumber - secondNumber;
        System.out.println("The result of " + secondNumber + " subtracted from " + firstNumber + " is equal to " + intResult);
        intResult = firstNumber * secondNumber;
        System.out.println("The result of " + firstNumber + " multiplied by " + secondNumber + " is equal to " + intResult);
        double doubleResult = firstNumber / secondNumber;
        System.out.println("The result of " + firstNumber + " divided by " + secondNumber + " is equal to " + doubleResult);
    }
}
