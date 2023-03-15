import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a diamond of the specified height
        //
        // Example:
        //
        // Please enter the diamond height: 4
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // Note: the height of the diamond is taken from its base
        // (where it is the widest) to the top.
        // The total number of lines produced is 2*height-1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        draw(number);
    }

    public static void draw(int size){
        // Write your code to draw the diamond here
        for (int i = 1; i <= size ; i++) {
            print(size, i);
        }
        for (int i = size - 1; i > 0 ; i--) {
            print(size, i);
        }
    }

    public static void print(int size, int i) {
        String result = " ".repeat(size - i);
        result += "*".repeat(2 * i - 1);
        System.out.println(result);
    }
}