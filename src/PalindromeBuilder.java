public class PalindromeBuilder {
    public static void main(String[] args) {
        //Create a function named build() following your current language's style guide.
        //It should take a string, create a palindrome from it and then return it.

        System.out.println(build("greenfox"));
        // should print: "greenfoxxofneerg"
        System.out.println(build("123"));
        // should print: "123321"
    }

    public static String build(String str) {
        String result = str;
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
