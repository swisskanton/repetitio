/*
Create a new class called Domino that has two integer fields that represents the two sides of a domino

Create a new class called To-do that has three fields representing the task as a string,
 the priority as string and whether it is done or not as a boolean

Create a new interface called Printable
    It should have one method definition called printAllFields
    Implement this interface on the Domino and To-do classes
    The domino should have the following string representation:
        "Domino A side: 3, B side: 2"
    The to-do should have the following string representation:
        "Task: Buy milk | Priority: high | Done: true"
 */
package printable;

public interface Printable {
    void printAllFields();
}
