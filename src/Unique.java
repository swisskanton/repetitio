import java.util.*;

public class Unique {
    public static void main(String[] args) {
        // Create a function that takes an array of numbers as a parameter
        // and returns an array of integers where every integer is unique
        // (occurs only once)

        // Example
        System.out.println(Arrays.toString(findUniqueItems(
                new int[] { 1, 11, 34, 11, 52, 61, 1, 34 })));
        // should print: `[1, 11, 34, 52, 61]`
    }

    public static int[] findUniqueItems(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int x: arr) {
            if (!result.contains(x))
                result.add(x);
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}