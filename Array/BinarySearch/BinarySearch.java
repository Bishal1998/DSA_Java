package Array.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 10, 11};

        int start = 0;
        int end = arr.length - 1;
        int key = 10;

        int mid = 0;

        /* First find the middle element and then check whether middle element is smaller or greater than the given key element. If it is smaller than search in the first half, if not search in the second half. */

        while (start <= end) {
            mid = (start / 2 + end / 2);

            if (arr[mid] == key) {
                System.out.println("Key found at index : " + mid);
                break;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

    }
}
