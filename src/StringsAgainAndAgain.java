import java.util.Scanner;

public class StringsAgainAndAgain {
    // Given a string, write a recursive (no loops) method which returns a new
    // string with all adjacent chars separated by an `*`. Please note that there
    // should be no trailing `*` at the end of the returned string. For example,
    // the string `word` should be changed to `w*o*r*d`.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine();
        System.out.printf("New string: %s", addAsterix(str));
    }

    public static String addAsterix(String str) {
        if (str.length() > 1)
            return str.charAt(0) + "*" + addAsterix(str.substring(1));
        else
            return str;
    }
}
