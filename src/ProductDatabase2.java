import java.util.HashMap;

public class ProductDatabase2 {
    //We are going to represent our products in a map where
    // the keys are strings representing the product's name and
    // the values are numbers representing the product's price.
    //Create a map with the following key-value pairs:
    //Product name (key)	Price (value)
    // Eggs	                200
    // Milk	                200
    // Fish	                400
    // Apples	            150
    // Bread                 50
    // Chicken	            550
    // Create an application which prints out the answers to the following questions:
    // - Which products cost less than 201? (just the name)
    // - Which products cost more than 150? (name + price)
    //The full output of your main method should be the following:
    // Apples
    // Eggs
    // Milk
    // Bread
    // Fish 400
    // Chicken 550
    // Eggs 200
    // Milk 200
    // NOTE: Your output lines may be in a different order
    // as the HashMap API does not define the order of iteration.

    static final HashMap<String, Integer> products = new HashMap<>() {{
        put("Eggs", 200);
        put("Milk", 200);
        put("Fish", 400);
        put("Apples", 150);
        put("Bread", 50);
        put("Chicken", 550);
    }};
    public static void main(String[] args) {
        printLessThanProducts(201);
        printMoreZhanProducts(150);
    }

    public static void printLessThanProducts(int price) {
        for (String x: products.keySet()) {
            if (products.get(x) < price)
                System.out.println(x);
        }
    }

    public static void printMoreZhanProducts(int price) {
        for (String x: products.keySet()) {
            if (products.get(x) > price)
                System.out.printf("%s %d\n",x, products.get(x));
        }
    }
}
