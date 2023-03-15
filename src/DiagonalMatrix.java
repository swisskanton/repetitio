import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // Write a program that asks for an integer `size` from the standard input,
        // then it creates a two-dimensional array (of integers) of the specified
        // size (nxn) with the value of 1 on the main diagonal and the value of 0
        // everywhere else. Print the 2d array into the output
        //
        // Example:
        //
        // Please enter the array (matrix) size: 4
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of matrix: ");
        int size = scanner.nextInt();
        int[][] matrix = create(size);
        print(matrix);
    }

    public static int[][] create(int size) {
        // write your code to create an nxn matrix of the given size here
        // this matrix should already have value of 1 on the main diagonal
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                arr[i][j] = (i != j) ? 0 : 1;
        }
        return arr;
    }

    public static void print(int[][] matrix) {
        // write your code to print the given matrix
        // into the (standard) output here
        for (int[] line: matrix) {
            for (int x: line) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}