/*
The Garden Application
The task is to create a garden application, so in your main method you should create a garden with
flowers and trees. The program should demonstrate an example garden with two flowers (yellow and blue)
and two trees (purple and orange). After creating these plants you should show the user how the garden
looks like. After that the program should water the garden twice, first with the amount of 40 then with 70.
After every watering the user should see the state of the garden as you can see in the output below:

    The yellow Flower needs water
    The blue Flower needs water
    The purple Tree needs water
    The orange Tree needs water

    Watering with 40
    The yellow Flower doesn't need water
    The blue Flower doesn't need water
    The purple Tree needs water
    The orange Tree needs water

    Watering with 70
    The yellow Flower doesn't need water
    The blue Flower doesn't need water
    The purple Tree doesn't need water
    The orange Tree doesn't need water

The Garden
    is able to hold unlimited amount of flowers and trees
    when watering it should only water those plants that need water with equally divided amount amongst them
    eg. watering with 40 and 4 of them need water then each gets watered with 10
 */
package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    public static void main(String[] args) {
        List<Plant> garden = new ArrayList<>() {{
        add(new Flower("yellow"));
        add(new Flower("blue"));
        add(new Tree("purple"));
        add(new Tree("orange"));
    }};

        printGarden(garden);
        gardenWatering(garden, 40);
        printGarden(garden);
        gardenWatering(garden, 70);
        printGarden(garden);

    }

    public static void gardenWatering(List<Plant> garden, int amount) {
        System.out.printf("\nWatering with %d\n", amount);
        for (Plant plant: garden) {
            plant.watering(amount / garden.size());
        }
    }

    public static void printGarden(List<Plant> garden) {
        for (Plant plant: garden) {
            System.out.println(plant.toString());
        }
    }
}
