import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the
same backwards and forwards. Can you determine if a given string, s, is a palindrome?

To solve this challenge, we must first take each character in s, enqueue it in a queue,
and also push that same character onto a stack. Once that's done, we must dequeue the first
character from the queue and pop the top character off the stack, then compare the two
characters to see if they are the same; as long as the characters match, we continue
dequeueing, popping, and comparing each character until our containers are empty
(a non-match means s isn't a palindrome).

Write the following declarations and implementations:
1. Two instance variables: one for your stack, and one for your queue.
2. A void pushCharacter(char ch) method that pushes a character onto a stack.
3. A void enqueueCharacter(char ch) method that enqueues a character in the queue instance variable.
4. A char popCharacter() method that pops and returns the character at the top of
 the stack instance variable.
5. A char dequeueCharacter() method that dequeues and returns the first character in
 the queue instance variable.

Output Format
"The word, %s, is a palindrome." ; otherwise, it will print "The word, %s, is not a palindrome."
 */
public class PalindromeQueueStack {

    Stack<Character> stack;
    LinkedList<Character> queue;

    public PalindromeQueueStack() {
        this.stack = new Stack<>();
        this.queue = new LinkedList<>();
    }

    public void pushCharacter(char c) {
        this.stack.add(c);
    }

    public void enqueueCharacter(char c) {
        this.queue.add(c);
    }

    public char popCharacter() {
        return this.stack.pop();
    }

    public char dequeueCharacter() {
        return this.queue.pop();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        PalindromeQueueStack p = new PalindromeQueueStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
