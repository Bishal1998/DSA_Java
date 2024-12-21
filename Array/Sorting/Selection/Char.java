package Array.Sorting.Selection;

import java.util.Arrays;

public class Char {

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        char[] arr = {'b', 'd', 'e', 'a', 'c'};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            char smallest = arr[0];

            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    smallest = arr[j];
                    swap(arr, i, j);
                } else {
                    smallest = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
