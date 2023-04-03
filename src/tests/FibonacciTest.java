package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci f = new Fibonacci();

    @Test
    void fibonacci() {
        assertEquals(0, f.fibonacci());
    }

    @Test
    void testFibonacciSuccess0() {
        assertEquals(0, f.fibonacci(0));
    }

    @Test
    void testFibonacciSuccess1() {
        assertEquals(0, f.fibonacci(1));
    }

    @Test
    void testFibonacciSuccess2() {
        assertEquals(1, f.fibonacci(2));
    }

    @Test
    void testFibonacciSuccess3() {
        assertEquals(1, f.fibonacci(3));
    }

    @Test
    void testFibonacciSuccess4() {
        assertEquals(2, f.fibonacci(4));
    }

    @Test
    void testFibonacciSuccess5() {
        assertEquals(3, f.fibonacci(5));
    }

    @Test
    void testFibonacciFails() {
        assertNotEquals(1, f.fibonacci(0));
    }

    @Test
    void testFibonacciSuccessToNegativeNumber() {
        assertEquals(0, f.fibonacci(-1));
    }

    @Test
    void fibo() {
        assertEquals(0, f.fibo());
    }

    @Test
    void testFiboSuccess0() {
        assertEquals(0, f.fibo(0));
    }

    @Test
    void testFibonSuccess1() {
        assertEquals(0, f.fibo(1));
    }

    @Test
    void testFibonSuccess2() {
        assertEquals(1, f.fibo(2));
    }

    @Test
    void testFibonSuccess3() {
        assertEquals(1, f.fibo(3));
    }

    @Test
    void testFiboSuccess4() {
        assertEquals(2, f.fibo(4));
    }

    @Test
    void testFiboSuccess5() {
        assertEquals(3, f.fibo(5));
    }

    @Test
    void testFiboFails() {
        assertNotEquals(1, f.fibo(0));
    }

    @Test
    void testFiboSuccessToNegativeNumber() {
        assertEquals(0, f.fibo(-1));
    }
}