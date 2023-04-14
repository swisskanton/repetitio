/*
You are given a class AreaOfParalelogram with a main method. Complete the given code so
that it outputs the area of a parallelogram with breadth B and height H.
You should read the variables from the standard input.

If B <= 0 or H  <= 0, the output should be "java.lang.Exception: Breadth and height must be positive"
without quotes.
 */

import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args) {

        try {
            area();
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    static void area() throws Exception {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        if (b <= 0 || h <= 0)
            throw new Exception("Breadth and height must be positive");
        System.out.println(b * h);
    }
}
