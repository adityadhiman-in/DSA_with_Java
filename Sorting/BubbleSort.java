//Bubble Sort : In bubble sort we compare two adjacent elements and send the largest element to the last index.

package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 55, 6, 7, 2, 1, 3, 25, 99 };
        bubbleSort(arr);
    }
}



