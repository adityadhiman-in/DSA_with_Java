package Sorting;

/**
 * MergeSort
 */
public class MergeSort {
    public static void conquer(int[] arr, int si, int ei) {
        int mid = si + (ei - si) / 2;
        int merged[] = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            merged[k++] = arr[i++];
        }
        while (j <= mid) {
            merged[k++] = arr[j++];
        }
        for (int x = 0, y = si; x < merged.length; x++, y++) {
            arr[y] = merged[x];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 3, 2, 5, 6, 6, 22, 45 };
        int len = arr.length;
        divide(arr, 0, len - 1);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}