import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {
    public static void main(String[] args) {
        //Create a function named search() following your current language's style guide.
        // It should take a string, search for palindromes of length at least 3 within
        // it and return them in an array.
        //
        //Hint: create a function named isPalindrome() which takes a string as an input
        // and returns true/false depending on whether the string is a palindrome or not.
        //
        System.out.println(search("dog goat dad duck doodle never"));
        //should print: ["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
        System.out.println(search("apple"));
        // should print: []
        System.out.println(search("racecar"));
        // should print: ["racecar", "aceca", "cec"]
        System.out.println(search(""));
        // should print: []
    }

    public static List<String> search(String str) {
        List<String> result = new ArrayList<>();
        for (int i = str.length(); i > 2 ; i--) {
            for (int j = 0; j <= str.length() - i; j++) {
                String temp = str.substring(j, j + i);
                if (isPalindrome(temp))
                    result.add(temp);
            }
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() -1 - i))
                return false;
        }
        return true;
    }
}
