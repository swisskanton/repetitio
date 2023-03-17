import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    //We are going to represent a shopping list by a list containing strings.
    //
    //Create a list with the following items:
    // eggs, milk, fish, apples, bread and chicken
    //Create an application which prints out the answers to the following questions:
    // - Do we have milk in the shopping list? (yes/no)
    // - Do we have bananas in the shopping list? (yes/no)
    //The full output of your main method should be the following:
    //
    //yes
    //no

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList(
                "eggs", "milk", "fish", "apples", "bread", "chicken"));
        System.out.println(containsIngredient(shoppingList, "milk"));
        System.out.println(containsIngredient(shoppingList, "banana"));
    }

    public static String containsIngredient(ArrayList<String> list, String value) {
        return list.contains(value) ? "yes" : "no";
    }
}
