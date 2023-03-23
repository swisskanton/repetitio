import java.util.Scanner;

public class Strings {
    // Given a string, write a recursive (no loops) method which returns
    // a new string with the lowercase 'x' chars changed to 'y' chars.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println(xToLowercaseY(text));
    }

    public static String xToLowercaseY(String str) {
        if (str.contains("x")) {
            str = str.replace("x", "y");
            xToLowercaseY(str);
        }
        return str;
    }
}
