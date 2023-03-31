/*
Create a new class called Domino that has two integer fields that represents the two sides of a domino

The domino should have the following string representation:
    "Domino A side: 3, B side: 2"
 */
package printable;

public class Domino implements Printable{
    int left;
    int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void printAllFields() {
        System.out.printf("Domino A side: %d, B side: %d\n", this.left, this.right);
    }

    public static void main(String[] args) {

        Domino d = new Domino(3, 2);
        d.printAllFields();
    }
}
