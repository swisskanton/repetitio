import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //Create a function named isAnagram() following your current language's style guide.
        // It should take two strings and return a boolean value depending on whether it's
        // an anagram or not.
        //
        //The function should ignore the letter case as well as any non (latin) letter
        // characters, i.e. "Astronomer" is an anagram of "Moon starer!"

        System.out.println(isAnagram("Astronomer", "Moon starer!"));
        // should print: true
        System.out.println(isAnagram("green", "fox"));
        // should print: false
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("[^a-z^A-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-z^A-Z]", "").toLowerCase();
        if (str1.length() != str2.length())
            return false;
        char[] lst1 = str1.toCharArray();
        Arrays.sort(lst1);
        char[] lst2 = str2.toCharArray();
        Arrays.sort(lst2);
        return new String(lst1).equals(new String(lst2));
    }
}