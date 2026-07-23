import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("c++");

        // Replace element at index
        // list.set(1, "spring boot");

        // Remove by index
        // list.remove(2);

        // list.remove("java");

        System.out.println(list);
        System.err.println(list.get(0));
        System.err.println();

        // Check if element exists
        System.out.println(list.contains("java"));

        // Number of elements
        System.out.println(list.size());

        // Check if empty
        System.out.println(list.isEmpty());

        // Remove all elements
        // list.clear();
        // System.out.println(list);
        // First index of element
        System.out.println(list.indexOf("python"));

         Object[] arr = list.toArray();  

        System.out.println(Arrays.toString(arr));

        //addAll method
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Java");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Python");

        list.addAll(list2);

        System.out.println(list1);
    }
}
