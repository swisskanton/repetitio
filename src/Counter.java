/*
Create Counter class
    which has a counter (integer) field
        at creation it should have a default value 0
    there are two ways to create the class:
        with 0 input parameters
        with 1 input parameter called counter which is set as the initial value of the counter field
    we can add another whole number to this counter: add(number)
    we can just increase the counter's value by one: add() (no parameters)
    we can get() the current counter value
    and we can reset() the counter to the initial value set during the construction of the class
 */

public class Counter {
    int counter;
    int initial;

    public Counter() {
        this.counter = 0;
        this.initial = 0;
    }

    public Counter(int counter) {
        this.counter = counter;
        this.initial = counter;
    }

    public void add() {
        this.counter++;
    }

    public void add(int number) {
        this.counter += number;
    }

    public int get() {
        return this.counter;
    }

    public void reset() {
        this.counter = this.initial;
    }

}
