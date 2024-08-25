import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList
 */
class ArrayLists {
    public static void main(String[] args) {
        // Declare ArrayLists with different data types
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Float> list3 = new ArrayList<Float>();
        ArrayList<Character> list4 = new ArrayList<Character>();

        // Add elements to ArrayLists
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        // Get elements
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        // Set elements
        list1.set(0, 5);
        System.out.println(list1);

        // Delete element
        list1.remove(2);
        System.out.println(list1);

        // Size
        System.out.println(list1.size());

        // Loops
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // Sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
}