package zoo;

public class Reptile extends Animal{

    public Reptile(String name) {
        this.name = name;
        this.bread = "laying eggs";
        this.numberOfLegs = 4;
    }

    @Override
    public String breed() {
        return this.bread;
    }
}
