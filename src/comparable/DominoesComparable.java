package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Get your Domino class
Implement the Comparable interface on the Domino
    we want to compare based on the result of Domino.compareTo()
First compare the first value and then the second
 */
public class DominoesComparable {

    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);

        System.out.println(dominoes);
    }

}
