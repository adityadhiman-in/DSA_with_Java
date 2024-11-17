package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 12, 8, 33, 2, 22, 4, 20 };
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}