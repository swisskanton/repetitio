package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    void getApple() {
        Apples fruit = new Apples("apple");
        assertEquals("apple", fruit.getApple());
    }
}