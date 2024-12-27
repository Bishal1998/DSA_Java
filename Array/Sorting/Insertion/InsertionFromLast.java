package Array.Sorting.Insertion;

import java.util.Arrays;

public class InsertionFromLast {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 5, 3};

        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                } else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr
        ));
    }
}
