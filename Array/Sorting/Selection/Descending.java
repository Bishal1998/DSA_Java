package Array.Sorting.Selection;

import java.util.Arrays;

public class Descending {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 2, 8};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int largest = arr[i];

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    largest = arr[j];
                    swap(arr, i, j);
                } else {
                    largest = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
