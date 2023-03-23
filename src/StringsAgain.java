import java.util.Scanner;

public class StringsAgain {
    // Given a string, write a recursive (no loops) method which returns
    // a new string with the lowercase 'x' chars removed.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine();
        System.out.println(removeX(str));
    }

    public static String removeX(String str) {
        if (str.contains("x")) {
            str = str.replace("x", "");
            removeX(str);
        }
        return str;
    }
}