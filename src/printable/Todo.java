/*
Create a new class called To-do that has three fields representing the task as a string,
 the priority as string and whether it is done or not as a boolean

 The to-do should have the following string representation:
    "Task: Buy milk | Priority: high | Done: true"
 */
package printable;

public class Todo implements Printable {
    String task;
    String priority;
    boolean isDone;

    public Todo(String task, String priority) {
        this.task = task;
        this.priority = priority;
        this.isDone = false;
    }

    public void setToDone() {
        this.isDone = true;
    }
    @Override
    public void printAllFields() {
        System.out.printf("Task: %s | Priority: %s | Done: %b\n", this.task, this.priority, this.isDone);
    }

    public static void main(String[] args) {

        Todo t = new Todo("Buy milk", "high");
        t.printAllFields();
        t.setToDone();
        t.printAllFields();
    }
}
