// HashMap Implementation in Java
import java.util.HashMap;

class Hashing {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        // Accessing values from the HashMap using keys
        System.out.println("Apple Count: " + map.get("Apple"));
        
        // Iterating through the HashMap
        System.out.println("Fruit Counts:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Removing an entry from the HashMap
        map.remove("Banana");
        
        System.out.println("After removing Banana: " + map);
    }
}
