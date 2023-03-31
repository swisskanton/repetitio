package zoo;

public class Mammal extends Animal {

    public Mammal(String name) {
        this.name = name;
        this.bread = "pushing miniature versions out";
        this.numberOfLegs = 4;
    }

    public Mammal(String name, int numberOfLegs) {
        this.name = name;
        this.bread = "pushing miniature versions out";
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String breed() {
        return this.bread;
    }
}
