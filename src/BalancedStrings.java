import java.util.Objects;
import java.util.Stack;

/*
A string containing only parentheses is balanced if the following is true:
    1. if it is an empty string
    2. if A and B are correct, AB is correct,
    3. if A is correct, (A) and {A} and [A] are also correct.
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.
 */
public class BalancedStrings {

    public static void main(String[] args) {

        System.out.println("true --> " + balanced("{}()"));
        System.out.println("true --> " + balanced("({()})"));
        System.out.println("false --> " + balanced("{}("));
        System.out.println("true --> " + balanced("[]"));
    }

    public static boolean balanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty() || !isPair(stack.peek(), str.charAt(i)))
                stack.push(str.charAt(i));
            else
                stack.pop();
        }
        return stack.isEmpty();
    }

    public static boolean isPair(Character a, Character c) {
        return (a.equals('(') && c.equals(')')) || (a.equals('[') && Objects.equals(c, ']')) || (a.equals('{') && c.equals('}'));
    }
}
