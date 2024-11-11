package Array.Lecture17;

import java.util.Scanner;

public class SearchElement {

    /* Search Element in an array
        Return the index of an element if exist
        else return -1
     */

    static int ReturnIndex(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element: ");
        int elem = sc.nextInt();

        System.out.println(ReturnIndex(arr, elem));

    }
}
