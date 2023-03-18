// An Armstrong number is an n-digit number which is equal to the
// sum of the nth powers of its digits.
//
// An example is 1634, because 1^4 + 6^4 + 3^4 + 4^4 = 1634
// Another example is 153, because 1^3 + 5^3 + 3^3 = 153
// Yet another example is 9926315, because 9^7 + 9^7 + 2^7 + 6^7 + 3^7 + 1^7 + 5^7 = 9926315
//
// Implement the static isArmstrongNumber method which takes a number and
// returns true or false based on whether the given number
// is an Armstrong number or not.

public class ArmstrongNumber {
    public static void main(String[] args) {
        long numberToCheck = 1634;

        if (isArmstrongNumber(numberToCheck)){
            System.out.println(numberToCheck + " is an Armstrong number");
        } else {
            System.out.println(numberToCheck + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrongNumber(long number) {
        String str = String.valueOf(number);
        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (long) Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), str.length());
        }
        return sum == number;
    }
}