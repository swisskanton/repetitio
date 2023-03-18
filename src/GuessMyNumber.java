import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    //Write a program which selected a number between 1 and 100 at random. The player is then asked to enter a guess.
    // If the guess wrong the program gives feedback and keeps asking for new guesses until one is correct.
    //
    // - Make the range customizable (ask for it before starting the guessing).
    // - You can add lives. (optional)

    //Expected Input/Output - Customizable Range & Lives
    //You have 5 lives! Please enter the min and max for the guess range:
    //-5
    //5
    //Guess a number between -5 and 5
    //0
    //Too high. You have 4 lives left!
    //-2
    //Too low. You have 3 lives left!
    //-1
    //Congratulations. You've won!

    //You have 5 lives! Please enter the min and max for the guess range:
    //0
    //50
    //Guess a number between 0 and 50
    //25
    //Too low. You have 4 lives left!
    //37
    //Too low. You have 3 lives left!
    //43
    //Too low. You have 2 lives left!
    //47
    //Too low. You have 1 lives left!
    //49
    //I'm sorry. You've run out of lives!
    public static void main(String[] args) {
        int lives = 5;
        System.out.printf("You have %d lives! Please enter the min and max for the guess range:\n", lives);
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        System.out.printf("Guess a number between %d and %d\n", min, max);
        Random random = new Random();
        int randomNumber = random.nextInt(max - min) + min;
        int guess = scanner.nextInt();
        while (guess != randomNumber && --lives > 0 ) {

            if (guess > randomNumber) System.out.printf("Too high. You have %d lives left!\n", lives);
            if (guess < randomNumber) System.out.printf("Too low. You have %d lives left!\n", lives);
            guess = scanner.nextInt();
        }
        if (guess == randomNumber) System.out.println("Congratulations. You've won!");
        if (lives == 0) System.out.println("I'm sorry. You've run out of lives!");
    }
}