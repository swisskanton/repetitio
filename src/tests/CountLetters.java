/*
Write a function, that takes a string as an argument and
 returns a dictionary with all letters in the string as keys,
 and numbers as values that shows how many occurrences there are.
Create a test for that.
 */
package tests;

import java.util.HashMap;

public class CountLetters {

    public CountLetters() {}

    public HashMap<Character, Integer> countLetters(String word) {

        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (result.containsKey((word.charAt(i)))) {
                result.put(word.charAt(i), result.get(word.charAt(i)) + 1);
            } else {
                result.put(word.charAt(i), 1);
            }
        }
        return result;
    }

    public HashMap<Character, Integer> countLetters() {
        return new HashMap<>();
    }
}
