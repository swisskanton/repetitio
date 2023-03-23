import java.util.Scanner;

public class GreatestCommonDivisor {
    // Write a recursive method which returns the greatest common divisor (GCD)
    // of two numbers. The method should be able to handle negative numbers!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers to calculate the greatest common divisor");
        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();
        n1 *= (n1 > 0) ? 1 : -1;
        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();
        n2 *= (n2 > 0) ? 1 : -1;
        if (n1 == 0 || n2 == 0)
            System.out.println("You entered zero.");
        else
            System.out.println(gcd(n1, n2));
    }

    public static int gcd(int num1, int num2) {
        if (num1 == num2)
            return num1;
        else {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return gcd(num1, num2);
    }
}
