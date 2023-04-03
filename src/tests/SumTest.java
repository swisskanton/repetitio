package tests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Sum obj = new Sum();

    @Test
    void sumMultipleElements() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            numbers.add(i);
        }
        assertEquals(15, obj.sum(numbers));
    }

    @Test
    void sumAnEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        assertEquals(0, obj.sum(numbers));
    }

    @Test
    void sumAListThatHasOneElement() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        assertEquals(3, obj.sum(numbers));
    }

    @Test
    void sumANull() {
        assertEquals(0, obj.sum());
    }
}