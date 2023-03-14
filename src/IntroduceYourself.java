import java.util.Calendar;

public class IntroduceYourself {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line:
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        String name = "Niels Henrik Abel";
        int age = Calendar.getInstance().get(Calendar.YEAR) - 1802;
        double height = 1.83;
        System.out.println(name + "\n" + age + "\n" + height);
    }
}
