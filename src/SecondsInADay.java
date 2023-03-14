public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
        int seconds = ((23 - currentHours) * 60 + (59 - currentMinutes)) * 60 + 60 - currentSeconds;
        System.out.printf("The remaining seconds from a day: %d", seconds);
    }
}
