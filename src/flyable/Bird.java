/*
Extend Bird from your abstract Animal class (zoo exercise)
    implement your Flyable interface
 */
package flyable;

import zoo.Animal;

public class Bird extends Animal implements Flyable {

    public Bird(String name) {
        this.name = name;
        this.gender = "female";
        this.numberOfLegs = 2;
        this.bread = "laying eggs";
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public void takeOff() {
        System.out.println("It can take off.");
    }

    @Override
    public String breed() {
        return this.bread;
    }
}
