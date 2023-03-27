/* Create an Animal class
 Every animal has a hunger value, which is a whole number
 Every animal has a thirst value, which is a whole number
 When creating a new animal instance these values must be set to the default 50 value
 Every animal can eat() which decreases its hunger by one
 Every animal can drink() which decreases its thirst by one
 Every animal can play() which increases both its hunger and thirst by one
*/
public class Animal {
    int hunger;
    int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        this.hunger--;
    }

    public void drink() {
        this.thirst--;
    }

    public void play() {
        this.hunger++;
        this.thirst++;
    }

    public static void main(String[] args) {
        Animal cat = new Animal();

        System.out.printf("At the start, hunger: %d, thirst: %d\n", cat.hunger, cat.thirst);
        for (int i = 0; i < 10; i++) {
            cat.drink();
            if (i % 2 == 0)
                cat.eat();
        }        System.out.printf("After drinking and eating, hunger: %d, thirst: %d\n", cat.hunger, cat.thirst);
        cat.play();
        System.out.printf("After a play, hunger: %d, thirst: %d\n", cat.hunger, cat.thirst);
    }
}
