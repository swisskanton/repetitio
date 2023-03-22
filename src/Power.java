import java.util.Scanner;

public class Power {
    // Given base and n that are both 1 or more, write a recursive method (no loops)
    // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers.");
        System.out.print("Enter the base value (1 or more): ");
        int base = scanner.nextInt();
        System.out.print("Enter the power value (1 or more): ");
        int power = scanner.nextInt();
        System.out.printf("The result is %d", powerN(base, power));
    }

    public static int powerN(int base, int power) {
        if (power == 0)
            return 1;
        else
            return base * powerN(base, power - 1);
    }
}
