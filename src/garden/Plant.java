package garden;

public abstract class Plant {
    String name;
    String type;
    double currentWaterAmount;
    int waterAmountMaximum;
    double absorptionRate;

    @Override
    public String toString() {
        return "The " + this.name + " " + this.type + (this.needsWater() ? " needs " : " doesn't need ") + "water";
    }

    public void watering(double amount) {
        this.currentWaterAmount += amount * absorptionRate;
    }

    public boolean needsWater() {
        return currentWaterAmount < waterAmountMaximum;
    }
}
