import java.util.*;

public class Candyshop {
    public static void main(String... args) {

        ArrayList<Object> sweets = new ArrayList<>();
        sweets.add("Cupcake");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);

        // Accidentally we added "2" and "false" to the sweets list
        // Your task is to change the "2" to "Croissant" and the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the list as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]
        System.out.println(repairSweetList(sweets));
    }

    public static ArrayList<Object> repairSweetList(ArrayList<Object> sweets) {
        sweets.set(sweets.indexOf(2), "Croissant");
        sweets.set(sweets.indexOf(false), "Ice cream");
        return sweets;
    }
}