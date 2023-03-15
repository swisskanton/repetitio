import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a square of the specified size
        //
        // Example:
        //
        // Please enter the square size: 6
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        draw(number);
    }

    public static void draw(int size){
        // Write your code to draw the square here
        String base = drawBase(size);
        String inner = drawInner(size);
        System.out.println(base);
        for (int i = 1; i < size - 1; i++) {
            System.out.println(inner);
        }
        if (size > 1) System.out.println(base);
    }

    public static String drawBase(int size) {
        return "%".repeat(size);
    }

    public static String drawInner(int size) {
        return (size > 1) ? "%" + " ".repeat(size - 2) + "%" : "";
    }
}