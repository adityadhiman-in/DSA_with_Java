package Searching;

/**
 * LinearSearch
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 24, 523, 22, 142, 53, 2, 5, 211, 109 };
        System.out.println(linearSearch(arr, 211));
    }
}