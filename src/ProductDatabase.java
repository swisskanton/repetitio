import java.util.HashMap;

public class ProductDatabase {
    //We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
    //
    //Create a products map with the following key-value pairs:
    //
    //Product name (key)	Price (value)
    //Eggs	200
    //Milk	200
    //Fish	400
    //Apples	150
    //Bread	50
    //Chicken	550
    //Create an application which prints out the answers to the following questions:
    //
    //How much is the fish?
    //What is the most expensive product?
    //What is the average price?
    //How many products' price is below 300?
    //Is there anything we can buy for exactly 125?
    //What is the cheapest product?
    //The full output of your main method should be the following:
    //
    //400
    //Chicken
    //258.33334
    //4
    //no
    //Bread
    //
    //Autograder Bonus
    //Java: make the products map a class constant (declared as static final)

    static final HashMap<String, Integer> products = new HashMap<>() {{
        put("Eggs", 200);
        put("Milk", 200);
        put("Fish", 400);
        put("Apples", 150);
        put("Bread", 50);
        put("Chicken", 550);
    }};

    public static void main(String[] args) {
        System.out.println(products.get("Fish"));
        System.out.println(mostExpensive());
        System.out.println(averagePrice());
        System.out.println(numberOfItemsBelow(300));
        System.out.println(isThereExactlyPrice(125));
        System.out.println(cheapestProduct());
    }

    public static String mostExpensive() {
        int max = 0;
        String item = "";
        for (String x: products.keySet()) {
            if (max < products.get(x)) {
                max = products.get(x);
                item = x;
            }
        }
        return item;
    }

    public static float averagePrice() {
        int sum = 0;
        for (String x: products.keySet()) {
            sum += products.get(x);
        }
        return (float) sum / products.size();
    }

    public static int numberOfItemsBelow(int price) {
        int count = 0;
        for (String x: products.keySet()) {
            if (products.get(x) < price)
                count++;
        }
        return count;
    }

    public static String isThereExactlyPrice(int price) {
        return products.containsValue(price) ? "yes" : "no";
    }

    public static String cheapestProduct() {
        String item = mostExpensive();
        int min = products.get(item);
        for (String x: products.keySet()) {
            if (min > products.get(x)) {
                item = x;
                min = products.get(x);
            }
        }
        return item;
    }
}
