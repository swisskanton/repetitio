/*
Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
    fields:
        level: the level of the mentor (junior / intermediate / senior)
    methods:
        getGoal(): prints "Educate brilliant junior software developers."
        introduce(): prints "Hi, I'm name, a age year old gender level mentor."
The Mentor class has the following constructors:
    Mentor(name, age, gender, level)
    Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
 */
package bootcamp;

public class Mentor extends Person {
    String level;

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s %s mentor.\n", this.name, this.age, this.gender, this.level);
    }
}
