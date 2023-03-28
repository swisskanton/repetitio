import java.util.ArrayList;

/*
    Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie, named listOfSharpies
        it has a method that adds a new Sharpie to the set: add(sharpie)
        it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
        it has a method that removes all unusable Sharpies: removeTrash()
 */
public class SharpieSet {
    public ArrayList<Sharpie> listOfSharpies = new ArrayList<>();

    public void add(Sharpie sharpie) {
        this.listOfSharpies.add(sharpie);
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie: this.listOfSharpies) {
            if (sharpie.inkAmount > 0)
                count++;
        }
        return count;
    }

    public void removeTrash() {
        this.listOfSharpies.removeIf(sharpie -> sharpie.inkAmount < 0);
    }

    public static void main(String[] args) {
        SharpieSet colors = new SharpieSet();

        Sharpie black = new Sharpie("black", 10);
        Sharpie blue =  new Sharpie("blue", 5);
        Sharpie cyan =  new Sharpie("cyan", 6);
        Sharpie teal =  new Sharpie("teal", 4);
        System.out.println("We can use " + colors.countUsable() + " colors.");

        colors.add(black);
        colors.add(blue);
        colors.add(cyan);
        colors.add(teal);
        System.out.println("We can use " + colors.countUsable() + " colors.");

        for (int i = 0; i < 10; i++) {
            blue.use();
            teal.use();
        }
        colors.removeTrash();
        System.out.println("We can use " + colors.countUsable() + " colors.");
    }
}
