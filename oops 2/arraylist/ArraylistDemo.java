import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistDemo {
    public static void main(String[] args) {
        // creating array
        ArrayList<String> names = new ArrayList<>();

        // adding array
        names.add("pranav");
        names.add("pratik");
        names.add("pravin");
        names.add("vishal");

        // access by index
        System.out.println(names.get(2));
         // Remove element
        names.remove("pravin");
        // Print all
        System.out.println(names);

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Access by index
        System.out.println("Element at index 1: " + list.get(1));

        // Remove element
        list.remove(1);

        // Print all
        System.out.println("LinkedList: " + list);
    }
}
