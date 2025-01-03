package mapInterfaces;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<String, Integer> inventory = new TreeMap<>();

        // Adding key-value pairs
        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 20);

        // Iterating over the map (sorted by keys)
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}

