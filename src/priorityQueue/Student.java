package priorityQueue;

public class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getCGPA() {
        return this.cgpa;
    }
}
