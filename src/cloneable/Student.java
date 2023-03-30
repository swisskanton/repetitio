/*
Create a Student class that has the same fields and methods as the Person class, and has the following additional
    fields:
        previousOrganization: the name of the student’s previous company / school
        skippedDays: the number of days skipped from the course
    methods:
        getGoal(): prints "Be a junior software developer."
        introduce(): prints "Hi, I'm name, a age year old gender from previousOrganization who skipped
            skippedDays days from the course already."
        skipDays(numberOfDays): increases skippedDays by numberOfDays
The Student class has the following constructors:
    Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
    Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life,
    skippedDays to 0
 */
package cloneable;

public class Student extends Person implements Cloneable {
    String previousOrganization;
    int skippedDays;

    public Student() {
        super();
        this.skippedDays = 0;
        this.previousOrganization = "The School of Life";
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s from %s who skipped %d days from the course already.\n", this.name, this.age, this.gender, this.previousOrganization, this.skippedDays);
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

    @Override
    public Student clone() {
        return new Student(this.name + "TheClone", this.age, this.gender, this.previousOrganization);
    }
}
