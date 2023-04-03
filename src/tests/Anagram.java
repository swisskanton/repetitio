/*
Write a function, that takes two strings and returns a boolean value
 based on if the two strings are Anagramms or not.
Create a test for that.
 */
package tests;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {

    public Anagram(){}

    public boolean isAnagram(String first, String second) {
        String str1 = Arrays.stream(first.split("")).sorted().collect(Collectors.joining(""));
        String str2 = Arrays.stream(second.split("")).sorted().collect(Collectors.joining(""));
        return str1.equals(str2);
    }

}