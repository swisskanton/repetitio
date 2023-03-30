/*
    Check out the CharSequence interface
Create a Gnirts class that represents a reversed String
    It should have one String field that can be set via the constructor
    It should implement the CharSequence interface. Implement its methods accordingly. E.g. if the Gnirts is constructed with the String "example" then the character at index 2 is 'p'
    Create a main() method and try out all the implemented functions
 */
package implementCharSequence;

public class Gnirts implements CharSequence {

    String string;

    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return this.string.length();
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(this.string.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder(this.string);
        return sb.reverse().subSequence(start, end).toString();
    }

    @Override
    public String toString() {
        return this.string;
    }

    public static void main(String[] args) {
        Gnirts txt = new Gnirts("example");
        System.out.println(txt);
        System.out.println(txt.charAt(2));
        System.out.println(txt.length());
        System.out.println(txt.subSequence(1, 6));
    }
}
