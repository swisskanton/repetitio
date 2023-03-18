import java.util.*;

public class Matchmaking {
    public static void main(String... args) {

        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

        System.out.println(match(girls, boys));
    }

    public static List<String> match(List<String> girls, List<String> boys) {
        List<String> result = new ArrayList<>();
        ListIterator<String> itGirls = girls.listIterator();
        ListIterator<String> itBoys = boys.listIterator();
        while (itGirls.hasNext() || itBoys.hasNext()) {
            String name = "";
            if (itGirls.hasNext())
                name = itGirls.next();
            if (itBoys.hasNext())
                name += name.equals("") ? itBoys.next() : "-" + itBoys.next();
            result.add(name);
        }
        return result;
    }
}