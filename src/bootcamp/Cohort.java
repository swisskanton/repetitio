/*
Create a Cohort class that has the following
    fields:
        name: the name of the cohort
        students: a list of Students
        mentors: a list of Mentors
    methods:
        addStudent(Student): adds the given Student to students list
        addMentor(Mentor): adds the given Mentor to mentors list
        info(): prints "The name cohort has students.size() students and mentors.size() mentors."
The Cohort class has the following constructors:
    Cohort(name): beside the given parameter it sets students and mentors to empty lists
 */
package bootcamp;

import java.util.ArrayList;

public class Cohort {
    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    public void info() {
        System.out.printf("The %s cohort has %d students and %d mentors.\n", this.name, this.students.size(), this.mentors.size());
    }

}
