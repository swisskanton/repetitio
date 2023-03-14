import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program which prompts the user for a double value
        // specifying a distance in miles, converts that value
        // to kilometers and prints it
        //
        // Example:
        //
        // Please enter a distance in miles: 1.8
        // The distance in km: 2.88
        //
        System.out.print("Please enter a distance in miles: ");
        Scanner scanner = new Scanner(System.in);
        double mile = scanner.nextDouble();
        double kilometers = 1.609344 * mile;
        System.out.println("The distance in km: " + kilometers);
    }
}