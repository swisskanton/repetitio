import java.util.HashMap;

public class ShoppingList2 {
    //Represent the following products with their prices:
    //
    //Product         Price
    //Milk          	1.07
    //Rice          	1.59
    //Eggs          	3.14
    //Cheese        	12.60
    //Chicken Breasts	9.40
    //Apples	        2.31
    //Tomato	        2.58
    //Potato        	1.75
    //Onion	            1.10
    //Represent Bob's shopping list:
    //
    //Product   	Amount
    //Milk          	3
    //Rice          	2
    //Eggs          	2
    //Cheese        	1
    //Chicken Breasts	4
    //Apples        	1
    //Tomato        	2
    //Potato        	1
    //Represent Alice's shopping list:
    //
    //Product   	Amount
    //Rice          	1
    //Eggs          	5
    //Chicken Breasts	2
    //Apples        	1
    //Tomato        	10
    //Create an application which prints out the answers to the following questions:
    //
    //How much does Bob pay?
    //How much does Alice pay?
    //Who buys more Rice?
    //Who buys more Potato?
    //Who buys more Ham?
    //Who buys more Apples?
    //Who buys more of different products?
    //Who buys more items? (more pieces)
    //The full output of your main method should be the following:
    //
    //72.09
    //64.2
    //Bob
    //Bob
    //no one
    //no one
    //Bob
    //Alice

    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>(){{
            put("Milk", 1.07);
            put("Rice", 1.59);
            put("Eggs", 3.14);
            put("Cheese", 12.60);
            put("Chicken Breasts", 9.40);
            put("Apples", 2.31);
            put("Tomato", 2.58);
            put("Potato", 1.75);
            put("Onion", 1.10);
        }};
        HashMap<String, Integer> bobsShoppingList = new HashMap<>(){{
            put("Milk", 3);
            put("Rice", 2);
            put("Eggs", 2);
            put("Cheese", 1);
            put("Chicken Breasts", 4);
            put("Apples", 1);
            put("Tomato", 2);
            put("Potato", 1);
        }};
        HashMap<String, Integer> alicesShoppingList = new HashMap<>(){{
            put("Rice", 1);
            put("Eggs", 5);
            put("Chicken Breasts", 2);
            put("Apples", 1);
            put("Tomato", 10);
        }};
        System.out.println(howMuchDoesPay(products, bobsShoppingList));
        System.out.println(howMuchDoesPay(products, alicesShoppingList));
        System.out.println(whoBuysMore(bobsShoppingList, alicesShoppingList, "Rice"));
        System.out.println(whoBuysMore(bobsShoppingList, alicesShoppingList, "Potato"));
        System.out.println(whoBuysMore(bobsShoppingList, alicesShoppingList, "Ham"));
        System.out.println(whoBuysMore(bobsShoppingList, alicesShoppingList, "Apples"));
        System.out.println(whoBuysMoreDifferentItems(bobsShoppingList, alicesShoppingList));
        System.out.println(whoBuysMoreItems(bobsShoppingList, alicesShoppingList));
    }
    
    public static double howMuchDoesPay(HashMap<String, Double> list, HashMap<String, Integer> items) {
        double sum = 0.0;
        for (String key: items.keySet()) {
            sum += items.get(key) * list.get(key);
        }
        return sum;
    }

    public static String whoBuysMore(HashMap<String, Integer> bobList, HashMap<String, Integer> aliceList, String item) {
        String result = "";
        if (bobList.containsKey(item) && aliceList.containsKey(item)) {
            if (bobList.get(item).equals(aliceList.get(item))) {
                result = "no one";
            } else if (bobList.get(item) > aliceList.get(item)) {
                result = "Bob";
            } else
                result = "Alice";
        } else if (bobList.containsKey(item) && !aliceList.containsKey(item)) {
            result = "Bob";
        } else if (!bobList.containsKey(item) && aliceList.containsKey(item)) {
            result = "Alice";
        } else
            result = "no one";
        return result;
    }

    public static String whoBuysMoreDifferentItems(HashMap<String, Integer> bobList, HashMap<String, Integer> aliceList) {
        String result = "";
        if (!bobList.isEmpty() && !aliceList.isEmpty()) {
            int bob = sumOfDifferentItems(bobList, aliceList);
            int alice = sumOfDifferentItems(aliceList, bobList);
            if (bob > alice)
                result = "Bob";
            else if (bob < alice)
                result = "Alice";
            else
                result = "no one";
        } else if (!bobList.isEmpty() && aliceList.isEmpty()) {
            result = "Bob";
        } else if (bobList.isEmpty() && !aliceList.isEmpty()) {
            result = "Alice";
        } else
            result = "no one";
        return result;
    }

    public static int sumOfDifferentItems(HashMap<String, Integer> first, HashMap<String, Integer> second) {
        int sum = 0;
        for (String key: first.keySet()) {
            if (!second.containsKey(key))
                sum += first.get(key);
        }
        return sum;
    }

    public static String whoBuysMoreItems(HashMap<String, Integer> bobList, HashMap<String, Integer> aliceList) {
        int bob = sumOfItems(bobList);
        int alice = sumOfItems(aliceList);
        String result = "";
        if (bob > alice)
            result = "Bob";
        else if (bob < alice)
            result = "Alice";
        else
            result = "no one";
        return result;
    }

    public static int sumOfItems(HashMap<String, Integer> list) {
        int sum = 0;
        for (String key: list.keySet()) {
            sum += list.get(key);
        }
        return sum;
    }
}
