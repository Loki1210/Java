package Module0;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple"));
        Set<String> uniqueFruits = new HashSet<>(fruits);
        
        Map<String, Integer> fruitCount = new HashMap<>();
        for (String fruit : fruits) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }

        System.out.println("Fruits List: " + fruits);
        System.out.println("Unique Fruits Set: " + uniqueFruits);
        System.out.println("Fruit Count Map: " + fruitCount);
    }
}
