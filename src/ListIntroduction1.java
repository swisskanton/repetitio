import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //We are going to play with lists. Feel free to use the built-in methods where possible.
        //
        //Create an empty list which will contain names (strings)
        ArrayList<String> names = new ArrayList<>();
        //Print out the number of elements in the list
        System.out.printf("The size of list: %d\n", names.size());
        //Add "William" to the list
        names.add("William");
        //Print out whether the list is empty or not
        System.out.printf("Is the list empty? %b\n", names.isEmpty());
        //Add "John" to the list
        names.add("John");
        //Add "Amanda" to the list
        names.add("Amanda");
        //Print out the number of elements in the list
        System.out.printf("The number of elements in the list: %d\n", names.size());
        //Print out the 3rd element
        System.out.printf("3rd element: %s\n", names.get(2));
        //Iterate through the list and print out each name
        for (String name: names) {
            System.out.printf("%s\n", name);
        }
        //Iterate through the list and print
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, names.get(i));
        }
        //Remove the 2nd element
        names.remove(1);
        //Iterate through the list in a reversed order and print out each name
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.printf("%s\n", names.get(i));
        }
        //Remove all elements
        names.clear();
        //Print out the number of elements in the list
        System.out.printf("The number of elements in the list: %d\n", names.size());

        // Output:
        //0
        //false
        //3
        //Amanda
        //William
        //John
        //Amanda
        //1. William
        //2. John
        //3. Amanda
        //Amanda
        //William
        //0
    }
}
