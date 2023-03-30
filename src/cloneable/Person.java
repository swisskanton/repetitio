/*
Create a Person class with the following fields:
    name: the name of the person
    age: the age of the person (whole number)
    gender: the gender of the person (male / female)
And the following methods:
    getGoal(): prints "My goal is: Live for the moment!"
    introduce(): prints "Hi, I'm name, a age year old gender."
And the following constructors:
    Person(name, age, gender)
    Person(): sets name to Jane Doe, age to 30, gender to female
 */
/*
Every Object has a clone() method (so all of your classes will have an inherited one too), but by default it doesn't do anything.
Get your Student and other relevant classes from the Bootcamp Exercise
Override and implement the clone() method, so it clones the student. Cloning means: create an independent copy with the same attributes (fields).
Instantiate John, a 20 years old male from BME
Clone him into jonhTheClone
 */
package cloneable;

public class Person implements Cloneable{
    String name;
    int age;
    String gender;

    public Person() {
        this("Jane Doe", 30, "female");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        if (gender.equals("male") || gender.equals("female"))
            this.gender = gender;
        else
            this.gender = "female";
    }

    protected void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    protected void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s.\n", this.name, this.age, this.gender);
    }

    @Override
    public Person clone() {
        return new Person(this.name + "TheClone", this.age, this.gender);
    }
}
