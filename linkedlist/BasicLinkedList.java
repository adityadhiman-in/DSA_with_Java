import java.util.LinkedList;

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("LinkedList: " + list);

        list.add(2, "Blueberry");

        System.out.println("After adding Blueberry: " + list);

        list.remove(1);

        System.out.println("After removing second element: " + list);

        System.out.println("Iterating through LinkedList:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("Does the list contain 'Date'? " + list.contains("Date"));

        System.out.println("Size of the LinkedList: " + list.size());
    }
}
