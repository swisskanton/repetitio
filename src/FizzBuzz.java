public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100
        // but for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) result += "Fizz";
            if (i % 5 == 0) result += "Buzz";
            if (result.equals("")) result += i;
            System.out.println(result);
        }
    }
}