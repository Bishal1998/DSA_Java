package Array.Lecture17;

import java.util.Arrays;

public class ReverseArray {

    // Reverse all the elements of an array

    static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {6, 11, 7, 4, 8, 9};

        int j = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            Swap(arr, i, j);
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
