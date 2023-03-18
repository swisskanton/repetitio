import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {

        // The Josephus Problem is when you have a circle of n people standing
        // and you want to cross out every second person (skipping the already crossed out ones)
        // step-by-step until only one remains. In this exercise your task is to
        // implement the getWinningSeat method which takes the number of
        // people that compose our imaginary circle and returns the position
        // of the last remaining person. The positions start from 1.
        //
        // A few expected results:
        //
        // getWinningSeat(1) === 1
        // getWinningSeat(2) === 1
        // getWinningSeat(3) === 3
        // getWinningSeat(7) === 7
        // getWinningSeat(12) === 9
        // getWinningSeat(41) === 19

        int numberOfPlayers = 13;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players:");
        numberOfPlayers = scanner.nextInt();

       // expected to output "The winning seat is 11 for 13 players"
        System.out.printf("The winning seat is %d for %d players", getWinningSeat(numberOfPlayers), numberOfPlayers);
    }

    public static int getWinningSeat(int numberOfPlayers) {
        ArrayList<Integer> seats = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            seats.add(i);
        }
        int rest = 1;
        while (seats.size() > 1) {
            for (int i = rest; i < seats.size(); i+=2) {
                seats.set(i, 0);
            }
            rest = (rest + seats.size()) % 2;
            seats.removeAll(Collections.singleton(0));
        }
        return seats.get(0);
    }
}