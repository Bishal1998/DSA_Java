package Array.Sorting.Selection;

import java.util.Arrays;

public class Ascending {

    /*
    Selection sort: First select the smallest element and swap it with the increasing index of the element

    First set the smallest element is the first element of the array and it compare with the other elements, if it find the other smallest then smallest will be changed and this value will be swapped with the newly found smallest.
     */

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 2, 3, 1, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
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
