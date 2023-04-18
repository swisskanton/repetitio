/*
Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is
printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values
(e.g., .1 = 0.1), then they must be listed in the same order as they were received as input).
 */
import java.math.BigDecimal;
import java.util.Scanner;

public class SortBigDecimal {

    public static void main(String[] args){

        String[] s = inputBigDecimal();
        s = sortBigDecimal(s);
        printBigDigits(s);
    }

    public static String[] inputBigDecimal() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();
        return s;
    }

    public static String[] sortBigDecimal(String[] s) {
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                BigDecimal a = new BigDecimal(s[j]);
                BigDecimal b = new BigDecimal(s[j + 1]);
                if (a.compareTo(b) < 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        return s;
    }

    public static void printBigDigits(String[] s) {
        for (String value : s) {
            System.out.println(value);
        }
    }
}