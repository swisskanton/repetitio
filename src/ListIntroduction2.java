import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction2 {
    public static void main(String[] args) {
        //Create a list ('List A') which contains the following values
        // Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        //Create a new list ('List B') with the values of List A
        ArrayList<String> listB = new ArrayList<>(listA);
        //Print out whether List A contains "Durian" or not
        System.out.println(listA.contains("Durian"));
        //Remove "Durian" from List B
        listB.remove("Durian");
        //Add "Kiwifruit" to List A after the 4th element
        listA.add(4, "Kiwifruit");
        //Compare the size of List A and List B
        System.out.printf("List A is bigger than List B? %b\n", listA.size() > listB.size());
        //Get the index of "Avocado" from List A
        System.out.println(listA.indexOf("Avocado"));
        //Get the index of "Durian" from List B
        System.out.println(listB.indexOf("Durian"));
        //Add "Passion Fruit" and "Pomelo" to List B in a single statement
        Collections.addAll(listB, "Passion Fruit", "Pomelo");
        //Print out the 3rd element from List A
        System.out.println(listA.get(2));
        //Print all elements of List A
        System.out.println(listA);
        //Print all elements of List B
        System.out.println(listB);

        // Output:
        //true
        //false
        //1
        //-1
        //Blueberries
        //[Apple, Avocado, Blueberries, Durian, Kiwifruit, Lychee]
        //[Apple, Avocado, Blueberries, Lychee, Passion Fruit, Pomelo]
    }
}
