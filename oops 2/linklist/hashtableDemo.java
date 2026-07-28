import java.util.Hashtable;
import java.util.Map;

public class hashtableDemo {
    public static void main(String[] args) {
        // Declare and initialize the map
        Map<Integer, String> map = new Hashtable<>();

        // Add key-value pairs
        map.put(101, "pranav");
        map.put(102, "ram");
        map.put(103, "ramesh");

        // Retrieve value by key
        System.out.println(map.get(102)); // Output: ram

        // Check if key exists
        System.out.println(map.containsKey(102)); // Output: true

        map.remove(103);

        for(Integer elem :map.keySet()){
            System.out.println(elem+":"+map.get(elem));
        }
    }
}

