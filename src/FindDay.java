/*
Complete the findDay function witch has the following parameters:
    int: month
    int: day
    int: year
Returns
    string: the day of the week in capital letters
Input Format
    A single line of input containing the space separated month, day and year, respectively,
    in MM DD YYY format.
 */
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

public class FindDay {

    public static void main(String[] args) {
        int month, day, year;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();
        year = sc.nextInt();
        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        return new DateFormatSymbols().getWeekdays()[c.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }
}
