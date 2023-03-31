/*
Extend Helicopter class from Vehicle
    implement your Flyable interface
 */
package flyable;

import java.awt.*;

public class Helicopter extends Vehicle implements Flyable{

    public Helicopter() {
        this.name = "Helicopter";
        this.type = "Air Ambulance Helicopter";
        this.land = true;
        this.maxSpeed = 350;
    }

    public Helicopter(String type, boolean land, int speed) {
        this.name = "Helicopter";
        this.type = type;
        this.land = land;
        this.maxSpeed = speed;
    }

    @Override
    public boolean land() {
        return this.land;
    }

    @Override
    public boolean fly() {
        return this.maxSpeed > 0;
    }

    @Override
    public void takeOff() {
        System.out.println((this.fly()) ? "It can take off." : "It can not take off.");
    }
}
