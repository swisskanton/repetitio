/*
The Flower
    needs water if its current water amount is less than 5
    when watered the flower can only absorb 75% of the water
    eg. watering with 10 the flower's amount of water should only increase by 7.5
 */
package garden;

public class Flower extends Plant{

    public Flower() {
        this.name = "a kind of flower";
        this.type = "Flower";
        this.waterAmountMaximum = 5;
        this.absorptionRate = 0.75;
    }

    public Flower(String name) {
        this.name = name;
        this.type = "Flower";
        this.waterAmountMaximum = 5;
        this.absorptionRate = 0.75;
    }
}
