package Array.BinarySearch;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};

        int target = 7;
        int first = -1;
        int last = -1;

        // find first
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // find last

        start = 0;
        end = arr.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("first: " + first + " last: " + last);
    }
}
