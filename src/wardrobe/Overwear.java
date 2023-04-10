/*
It has a default condition of 50 (but it should be possible to specify a different condition).
It needs to be washed after 5 days of wearing.
It needs to be repaired if its condition value is between 1 and 5.
 */
package wardrobe;

public class Overwear implements Cloth {
    String type;
    String color;
    int condition = 50;
    int initialCondition= 50;
    int daysWorn = 0;

    public Overwear() {
        this.type = "t-shirt";
        this.color = "blue";
    }

    public Overwear(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Overwear(String type, String color, int condition) {
        this.type = type;
        this.color = color;
        this.condition = condition;
        this.initialCondition = condition;
    }

    @Override
    public boolean needsToBeWashed() {
        return this.daysWorn >= 5;
    }

    @Override
    public boolean needsToBeRepaired() {
        return 1 < this.condition && this.condition < 5;
    }

    @Override
    public void wear() throws Exception {
        this.daysWorn++;
        if (this.needsToBeWashed()) throw new Exception();
    }

    @Override
    public void wash() {
        this.daysWorn = 0;
        this.condition = Math.max(this.condition - 1, 0);
    }

    @Override
    public void repair() {
        this.condition = this.initialCondition;
    }

    @Override
    public String getInfo() {
        return String.format("%s %s worn for %d days, has %d wash cycles left", this.color, this.type, this.daysWorn, this.condition);
    }
}
