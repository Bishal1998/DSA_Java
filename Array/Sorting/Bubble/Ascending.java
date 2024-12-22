package Array.Sorting.Bubble;

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

        for (int i = 0; i < n - 1; i++) {

            /* swapped is used to check whether the swap is made in any iteration or not, if not made it will break the loop */

            boolean swapped = false;

            /* n-i-1 : no need to iterate over the elements which are already sorted */
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
