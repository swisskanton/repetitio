/*
It has a default condition of 100 (but it should be possible to specify a different condition).
It needs to be washed after one day of wearing.
It cannot be repaired.
 */
package wardrobe;

public class Underwear implements Cloth{
    String type;
    String color;
    int condition = 100;
    int initialCondition= 100;
    int daysWorn = 0;

    public Underwear() {
        this.type = "briefs";
        this.color = "white";
    }

    public Underwear(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public Underwear(String type, String color, int condition) {
        this.type = type;
        this.color = color;
        this.condition = condition;
        this.initialCondition = condition;
    }

    @Override
    public boolean needsToBeWashed() {
        return this.daysWorn >= 1;
    }

    @Override
    public boolean needsToBeRepaired() {
        return false;
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
    public void repair() {}

    @Override
    public String getInfo() {
        return String.format("%s %s worn for %d days, has %d wash cycles left", this.color, this.type, this.daysWorn, this.condition);
    }
}
