package sorting;

import java.util.*;

public class SortMethod {
    public static void main(String[] args) {
        int[] arr = { 22, 3, 44, 5, 1, 331, 342, 1 };
        Arrays.sort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}