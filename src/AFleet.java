import java.util.ArrayList;

public class AFleet {
    private ArrayList<AThing> things;

    public AFleet() {
        things = new ArrayList<>();
    }

    public void add(AThing thing) {
        things.add(thing);
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < things.size(); i++) {
            result += (i+1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}
