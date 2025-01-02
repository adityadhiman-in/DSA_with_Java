package recursion;

public class FirstIndex {
    public static int firstIndex(int[] arr, int x, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == x) {
            return i;
        } else {
            int idx = firstIndex(arr, x, i + 1);
            return idx;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 33, 23, 7, 45, 4, 55, 2, 3, 7, 1 };
        System.out.println(firstIndex(arr, 7, 0));

    }
}