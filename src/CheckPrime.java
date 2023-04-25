import java.util.Scanner;

/*
Your task is to create a class Prime. The class Prime should contain a single method checkPrime.
The locked code in the editor will call the checkPrime method with one or more integer arguments.
You should write the checkPrime method in such a way that the code prints only the prime numbers.
Please read the code given in the editor carefully. Also please do not use method overloading!
    Input Format
There are only five lines of input, each containing one integer.
    Output Format
There will be only four lines of output. Each line contains only prime numbers depending upon the
parameters passed to checkPrime in the main method of the class Solution. In case there is no prime
number, then a blank line should be printed.
    Sample Input
2 1 3 4 5                       1 2 3 4 5               7 18 2 5 10
    Sample Output
2                               ""                      7
2                               2                       7
2 3                             2 3                     7 2
2 3 5                           2 3 5                   7 2 5
 */
class Prime {

    void checkPrime(int... values) {
        String[] primes = new String[4];
        int index = 0;
        for (int value : values) {
            boolean isPrime = value != 1;
            for (int j = 2; j < (value / 2) + 1; j++) {
                if (value % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                if (index < 4)
                    primes[index] = (index == 0 ? "" : primes[index - 1] + (primes[index - 1].equals("") ? "" : " ")) + value;
                else
                    primes[3] += primes[3].equals("") ? "" : " " + value;
            else if (index < 4)
                primes[index] = index == 0 ? "" : primes[index - 1];
            index++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(primes[i]);
        }
    }
}

public class CheckPrime {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Prime prime = new Prime();
        /*
        Scanner sc  = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        prime.checkPrime(numbers);
        */
        prime.checkPrime(2, 1, 3, 4, 5);
        System.out.println();
        prime.checkPrime(1, 2, 3, 4, 5);
        System.out.println();
        prime.checkPrime(7, 18, 2, 5, 10);
        System.out.println();
    }
}
