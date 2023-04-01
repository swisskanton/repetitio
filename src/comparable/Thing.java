package comparable;

public class Thing implements  Comparable<Thing> {
    private String description;
    private boolean completed;

    public Thing(String description) {
        this.description = description;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + this.description;
    }

    @Override
    public int compareTo(Thing o) {
        if (this.completed == o.completed)
            return this.description.compareTo(o.description);
        return String.valueOf(this.completed).compareTo(String.valueOf(o.completed)) * -1;
    }
}
