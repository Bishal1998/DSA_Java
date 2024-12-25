package Array.Sorting.Insertion;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Ascending {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 5, 3};

        int n = arr.length;

        /* comparison occurs in reverse order like we check whether 4 is smaller than 7 or not, if smaller founds, we swap. So we are starting from 1 and we can compare 1 with 0. If swap doesn't possible we just break out of the inner loop. */

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
