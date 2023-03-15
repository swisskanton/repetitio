import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]
        List<String> orders = new ArrayList<>();
        orders.add("first");
        orders.add("second");
        orders.add("third");
        Collections.swap(orders, 0, 2);
        System.out.println(orders);
    }
}