public class MatrixTransposition {

    public static int[][] transposition(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] spiral) {
        for (int[] ints : spiral) {
            for (int anInt : ints) {
                System.out.printf("%4s", anInt);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m = {{0,3,6}, {1,4,7}};//, {7,8,9}};
        printMatrix(m);
        System.out.println();
        printMatrix(transposition(m));
/*
        m = new int[][]{{0,3,6,5}, {1,4,7,8}, {1,2,5,9}};
        printMatrix(m);
        System.out.println();
        printMatrix(transposition(m));*/
    }
}
