import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        //We are going to play with maps. Feel free to use the built-in methods where possible.
        //
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> map = new HashMap<>();
        //Print out whether the map is empty or not
        System.out.println(map.isEmpty());
        //Add the following key-value pairs to the map
        //97 : a, 98 : b, 99 : c, 65 : A, 66 : B, 67 : C
        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');
        //Print all the keys
        System.out.println(map.keySet());
        //Print all the values
        System.out.println(map.values());
        //Add value D with the key 68
        map.put(68, 'D');
        //Print how many key-value pairs are in the map
        System.out.println(map.size());
        //Print the value that is associated with key 99
        System.out.println(map.get(99));
        //Remove the key-value pair with key 97 and print the associated value
        System.out.println(map.remove(97));
        //Print whether there is an associated value with key 100 or not
        System.out.println(map.containsKey(100));
        //Remove all the key-value pairs
        map.clear();
        //Print how many key-value pairs are in the map
        System.out.println(map.size());
    }

}
