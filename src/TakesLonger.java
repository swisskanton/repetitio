public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It"
        // and "you" using the StringBuilder class!
        StringBuilder sb = new StringBuilder(quote);
        sb.replace(quote.indexOf("It"), quote.indexOf("It") + 2, "always takes longer than");
        quote = sb.toString();
        //
        System.out.println(quote);
    }
}