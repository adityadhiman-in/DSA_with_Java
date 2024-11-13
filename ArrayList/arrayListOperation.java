package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        // add
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // add at index
        list1.add(3, 5);

        // get
        System.out.println(list1.get(2));

        // set
        list1.set(2, 5);

        // remove
        list1.remove(2);

        // print the list
        System.out.println(list1);
    }
}