/*
You have the `Thing` class and the `Fleet` class
You have the `FleetOfThings` class with a `main()` method
Create a fleet in the main() method
Make your Fleet Of Things class implement Comparable
        It should compare the completed field first
        Then the description
Create a fleet of things to have this output:
    1. [x] Eat lunch
    2. [x] Stand up
    3. [ ] Get milk
    4. [ ] Remove the obstacles
 */
package comparable;

import java.util.HashMap;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        createFleet(fleet);
        System.out.println(fleet);
    }

    private static void createFleet(Fleet fleet) {
        HashMap<String, Boolean> listOfThings = new HashMap<>() {{
            put("Get milk", false);
            put("Remove the obstacles", false);
            put("Stand up", true);
            put("Eat lunch", true);
        }};

        for (String key: listOfThings.keySet()) {
            Thing thing = new Thing(key);
            if (listOfThings.get(key))
                thing.complete();
            fleet.add(thing);
        }
    }
}
