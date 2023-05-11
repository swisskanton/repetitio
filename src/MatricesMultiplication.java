public class MatricesMultiplication {

    public static int[][] multiply(int[][] m, int[][] n) {
        int row1 = m.length;
        int row2 = n.length;
        int col2 = n[0].length;
        int[][] result = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    result[i][j] += m[i][k] * n[k][j];
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
        int[][] m = new int[][]{{1, 2, 3},{4, 5, 6}};
        int[][] n = new int[][]{{7 , 8},{9 , 10},{11, 12}};
        printMatrix(m);
        System.out.println();
        printMatrix(n);
        System.out.println();
        printMatrix(multiply(m, n));
    }
}
