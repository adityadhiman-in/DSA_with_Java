package recursion;

public class PrintArray {

    public static void printArray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 22, 1, 23, 35, 66, 23, 16, 667 };
        printArray(arr, 0);
    }
}