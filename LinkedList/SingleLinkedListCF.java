// Linked List with the collection framework - java 

import java.util.LinkedList;

/**
 * SingleLinkedListCF
 */
public class SingleLinkedListCF {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // add - last and first
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("My");
        list.addFirst("Hello");
        list.addLast("aditya");

        // list - size
        System.out.println(list.size());

        // Printing linked list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("Null");

        list.removeFirst();
        list.removeLast();

        System.out.println(list.size());

    }
}