/*
Create a ShiftedCharSequence class implementing this interface
    This CharSequence can be constructed using the following arguments:
        a String (that is to be shifted)
        a number (which defines how many characters to shift)
    Implement the methods so that the sequence is shifted by the defined number of characters
 */
package implementCharSequence;

public class ShiftedCharSequence implements CharSequence {
    String string;
    int number;

    public ShiftedCharSequence(String string, int number) {
        this.string = string;
        this.number = number;
    }

    @Override
    public int length() {
        return this.string.length();
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt((this.number + index) % this.string.length());
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String s = this.string.substring(this.number % this.string.length()) + this.string.substring(0, this.number % this.string.length() + 1);
        return s.subSequence(start, end);
    }

    @Override
    public String toString() {
        return this.string;
    }

    public static void main(String[] args) {
        ShiftedCharSequence txt = new ShiftedCharSequence("example", 2);
        System.out.println(txt);
        System.out.println(txt.charAt(0));
        System.out.println(txt.length());
        System.out.println(txt.subSequence(1, 6));
    }
}
