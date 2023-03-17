import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    //We are going to represent our expenses in a list containing integers.
    //
    //Create a list with the following items:
    // 500, 1000, 1250, 175, 800 and 120
    //Create an application which prints out the answers to the following questions:
    // - How much did we spend?
    // - Which was our greatest expense?
    // - Which was our cheapest spending?
    // - What was the average amount of our spendings? (print this as a float value)
    //The full output of your main method should be the following:
    //
    //3845
    //1250
    //120
    //640.8333
    public static void main(String[] args) {
        ArrayList<Integer> amounts = new ArrayList<>();
        Collections.addAll(amounts, 500, 1000, 1250, 175, 800, 120);
        System.out.println(sumOfAmounts(amounts));
        System.out.println(greatestOfAmounts(amounts, true));
        System.out.println(greatestOfAmounts(amounts, false));
        System.out.println(averageAmount(amounts));
    }

    public static int sumOfAmounts(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer x: list) {
            sum += x;
        }
        return sum;
    }

    public static int greatestOfAmounts(ArrayList<Integer> list, boolean checkMax) {
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (checkMax) {
                if (result < list.get(i))
                    result = list.get(i);
            } else {
                if (result > list.get(i))
                    result = list.get(i);
            }
        }
        return result;
    }

    public static float averageAmount(ArrayList<Integer> list) {
        return (float) sumOfAmounts(list) / list.size();
    }
}
