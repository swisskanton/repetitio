package zoo;

public class Bird extends Animal{

    public Bird(String name) {
        this.name = name;
        this.bread = "laying eggs";
        this.numberOfLegs = 2;
    }

    @Override
    public String breed() {
        return this.bread;
    }
}
