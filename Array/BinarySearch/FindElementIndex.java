package Array.BinarySearch;

public class FindElementIndex {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10, 14, 16, 18};

        int start = 0, end = arr.length - 1, target = 5, index = arr.length;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                index = mid;
                end = mid - 1;
            }
        }
        System.out.println("Index: " + index);

    }
}
