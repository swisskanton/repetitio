package tests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    CountLetters counter = new CountLetters();

    @Test
    void countLettersSuccess() {
        HashMap<Character, Integer> expected = new HashMap<>(){{
            put('a', 5);
            put('b', 2);
            put('r', 2);
            put('c', 1);
            put('d', 1);
        }};
        assertEquals(expected, counter.countLetters("abracadabra"));
    }

    @Test
    void countLettersFails() {
        HashMap<Character, Integer> expected = new HashMap<>(){{
            put('a', 1);
            put('b', 2);
            put('r', 2);
            put('c', 1);
            put('d', 1);
        }};
        assertNotEquals(expected, counter.countLetters("abracadabra"));
    }

    @Test
    void countLettersWhenStringIsEmpty() {
        HashMap<Character, Integer> expected = new HashMap<>();
        assertEquals(expected, counter.countLetters(""));
    }

    @Test
    void testCountLetters() {
        HashMap<Character, Integer> expected = new HashMap<>();
        assertEquals(expected, counter.countLetters());
    }
}