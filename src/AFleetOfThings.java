import java.util.HashMap;

public class AFleetOfThings {
    public static void main(String[] args) {
        AFleet fleet = new AFleet();
        // - You have the `Thing` class and the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        createFleet(fleet);
        System.out.println(fleet);
    }

    private static void createFleet(AFleet fleet) {
        HashMap<String, Boolean> listOfThings = new HashMap<>() {{
            put("Get milk", false);
            put("Remove the obstacles", false);
            put("Stand up", true);
            put("Eat lunch", true);
        }};

        for (String key: listOfThings.keySet()) {
            AThing thing = new AThing(key);
            if (listOfThings.get(key))
                thing.complete();
            fleet.add(thing);
        }
    }
}
