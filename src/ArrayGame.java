import java.util.Scanner;
/*
Let's play a game on an array! You're standing at index 0 of an n-element array named game.
From some index i (where 0<= i < n), you can perform one of the following moves:
    Move Backward: If cell  exists and contains a , you can walk back to cell .
    Move Forward:
        If cell i + 1 contains a zero, you can walk to cell i + 1.
        If cell i + leap contains a zero, you can jump to cell i + leap.
        If you're standing in cell n - 1 or the value of i + leap >= n, you can walk
        or jump off the end of the array and win the game.
In other words, you can move from index i to index i+ 1, i - 1, or i + leap as long as
the destination index is a cell containing a 0. If the destination index is greater than n - 1,
you win the game.

    Function Description
Complete the canWin function.
    canWin has the following parameters:
        int leap: the size of the leap
        int game[n]: the array to traverse
Returns
    boolean: true if the game can be won, otherwise false
 */
public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
        return getWinner(leap, game, 0);
    }

    public static boolean getWinner(int leap, int[] game, int current) {

        if (current >= game.length) {
            return true;
        } else if (current < 0 || game[current] == 1) {
            return false;
        }
        game[current] = 1;

        return getWinner(leap, game, current + leap) ||
                getWinner(leap, game, current + 1) ||
                getWinner(leap, game, current - 1);
    }

    public static boolean contains(int[] arr, int element) {
        boolean result = false;
        for (int item : arr) {
            if (item == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        testArrayGame();
        /*
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
        */
    }

    public static void testArrayGame() {
        System.out.println("YES --> " + (canWin(3, new int[]{0, 0, 0, 0, 0}) ? "YES" : "NO" ));
        System.out.println("YES --> " + (canWin(5, new int[]{0, 0, 0, 1, 1, 1}) ? "YES" : "NO" ));
        System.out.println("NO --> " + (canWin(3, new int[]{0, 0, 1, 1, 1, 0}) ? "YES" : "NO" ));
        System.out.println("NO --> " + (canWin(1, new int[]{0, 1, 0}) ? "YES" : "NO" ));
        System.out.println("YES --> " + (canWin(2, new int[]{0, 1, 0, 1, 0, 1}) ? "YES" : "NO" ));
        System.out.println("NO --> " + (canWin(6, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0}) ? "YES" : "NO" ));
        System.out.println("YES --> " + (canWin(3, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0}) ? "YES" : "NO" ));
        System.out.println("NO --> " + (canWin(5, new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1}) ? "YES" : "NO" ));
        System.out.println("NO --> " + (canWin(5, new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1}) ? "YES" : "NO" ));
    }
}