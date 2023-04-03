package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram ana = new Anagram();

    @Test
    void isAnagramIsTrue() {
        assertTrue(ana.isAnagram("papi", "pipa"));
    }

    @Test
    void isAnagramIsFalse() {
        assertFalse(ana.isAnagram("pap", "pip"));
    }
}