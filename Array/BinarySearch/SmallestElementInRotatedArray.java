package Array.BinarySearch;

public class SmallestElementInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 10, 2, 4};

        int start = 0, end = arr.length - 1, mid, ans = arr[0];

        while (start <= end) {
            mid = (start + (end - start) / 2);

            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                ans = arr[mid];
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
