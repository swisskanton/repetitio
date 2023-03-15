import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a pyramid of the specified height
        //
        // Example:
        //
        // Please enter the pyramid height: 4
        //    *
        //   ***
        //  *****
        // *******
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        draw(number);
    }

    public static void draw(int height){
        // Write your code to draw the pyramid here
        for (int i = 1; i <= height ; i++) {
            String result = " ".repeat(height - i);
            result += "*".repeat(2 * i - 1);
            System.out.println(result);
        }
    }
}