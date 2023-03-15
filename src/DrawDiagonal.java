import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a square with the main diagonal of the specified size
        //
        // Example:
        //
        // Please enter the square size: 6
        // %%%%%%
        // %%   %
        // % %  %
        // %  % %
        // %   %%
        // %%%%%%
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        draw(number);
    }

    public static void draw(int size){
        // Write your code to draw a square with the main diagonal here
        drawBase(size);
        drawInner(size);
        if (size > 1) drawBase(size);
    }

    public static void drawBase(int size) {
        String result = "%".repeat(size);
        System.out.println(result);
    }

    public static void drawInner(int size) {
        for (int i = 1; i < size - 1; i++) {
            StringBuilder result = new StringBuilder("%");
            for (int j = 1; j < size - 1; j++) {
                result.append((j == i) ? "%" : " ");
            }
            result.append("%");
            System.out.println(result);
        }
    }
}