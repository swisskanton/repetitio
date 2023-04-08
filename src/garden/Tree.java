/*
The Tree
    needs water if its current water amount is less than 10
    when watered the tree can only absorb the 40% of the water
    eg. watering with 10 the tree's amount of water should only increase by 4
 */
package garden;

public class Tree extends Plant{

    public Tree() {
        this.name = "a kind of tree";
        this.type = "Tree";
        this.waterAmountMaximum = 10;
        this.absorptionRate = 0.4;
    }

    public Tree(String name) {
        this.name = name;
        this.type = "Tree";
        this.waterAmountMaximum = 10;
        this.absorptionRate = 0.4;
    }
}
