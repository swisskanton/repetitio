import java.util.ArrayList;

/*
    Reuse your Animal class
    Create a Farm class
        it has a list of Animals listOfAnimals
        it has a limit that defines how many animals can be kept in the Farm and can be set when the Farm is created
        it has two methods:
            breed() -> creates a new animal if there's place for it
            sell() -> removes the least hungry animal
 */
public class Farm {
    int limit;

    public ArrayList<Animal> listOfAnimals = new ArrayList<>();

    public Farm(int value) {
        this.limit = value;
    }

    public void bread() {
        if (this.listOfAnimals.size() < this.limit) {
            Animal animal = new Animal();
            this.listOfAnimals.add(animal);
        }
    }

    public void sell() {
        if (!this.listOfAnimals.isEmpty()) {
            Animal leastHungerAnimal = new Animal();
            int hunger = this.listOfAnimals.get(0).hunger;
            for (Animal item: this.listOfAnimals) {
                if (item.hunger < hunger) {
                    hunger = item.hunger;
                    leastHungerAnimal = item;
                }
            }
            this.listOfAnimals.remove(leastHungerAnimal);
        }
    }

    public static void main(String[] args) {

        Farm farm = new Farm(4);
        System.out.println(farm.listOfAnimals.size());

        for (int i = 0; i < 6; i++) {
            farm.bread();
        }
        System.out.println(farm.listOfAnimals.size());

        farm.listOfAnimals.get(1).eat();
        farm.sell();
        System.out.println(farm.listOfAnimals.size());
    }
}
