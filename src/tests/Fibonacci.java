/*
Write a function that computes a member of the fibonacci sequence by a given index
Create tests for multiple test cases
 */
package tests;

public class Fibonacci {

    public Fibonacci() {}

    public int fibonacci() {
        return 0;
    }

    public int fibonacci(int num) {
        if (num <= 1) return 0;
        if (num == 2) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public int fibo(int num) {
        if (num < 1) return 0;
        int fib = 0, fib1 = 1;
        while (num-- > 1) {
            int temp = fib + fib1;
            fib = fib1;
            fib1 = temp;
        }
        return fib;
    }

    public int fibo() {
        return 0;
    }

}