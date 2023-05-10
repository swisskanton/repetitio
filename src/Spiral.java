public class Spiral {
    public static int[][] spiral(int rows, int columns) {
        int[][] spiral = new int[rows][columns];
        int i = 1, x = 0, y = 0;
        int horStart = 0, horEnd = columns - 1;
        int verStart = 0, verEnd = rows - 1;
        int max = rows * columns + 1;
        while (i < max) {
            while (x < horEnd && i < max) {
                spiral[y][x++] = i++;
            }
            verStart++;
            while (y < verEnd && i < max) {
                spiral[y++][x] = i++;
            }
            horEnd--;
            while (x > horStart && i < max) {
                spiral[y][x--] = i++;
            }
            verEnd--;
            while (y > verStart && i < max) {
                spiral[y--][x] = i++;
            }
            horStart++;
        }
        return spiral;
    }

    public static void spiralPrint(int[][] spiral) {
        for (int[] ints : spiral) {
            for (int anInt : ints) {
                System.out.printf("%4s", anInt);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] spiral = spiral(5, 5);
        spiralPrint(spiral);
    }
}
