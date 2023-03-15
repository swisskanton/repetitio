import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        draw(number);
    }

    public static void draw(int height){
        // Write your code to draw the triangle here
        for (int i = 1; i <= height ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}