package Array.Lecture17;

import java.util.Arrays;

public class RotateArray {
    // Rotate the array by 1
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 11, 5, 8};
        int n = arr.length - 1;
        int temp = arr[n];

        for (int i = n; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
