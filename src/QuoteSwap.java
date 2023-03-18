import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {

        List<String> list = Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand.");

        // Accidentally I messed up this quote from Richard Feynman
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // To do this: create a method called "swapQuote()"
        // it should return a sentence formed from the words separated by a single space

        // Expected output: "What I cannot create, I do not understand."
        System.out.println(swapQuote(list));
    }

    public static String swapQuote(List<String> list) {
        list.set(list.indexOf("cannot"), "do");
        list.set(list.indexOf("do"), "cannot");
        return String.join(" ", list);
    }
}