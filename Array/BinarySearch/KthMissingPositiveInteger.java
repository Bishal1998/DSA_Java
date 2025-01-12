package Array.BinarySearch;

public class KthMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};

        int start = 0, end = arr.length - 1, mid, ans = arr.length, k = 5;

        while (start <= end) {
            mid = (start + (end - start) / 2);

            if (arr[mid] - mid - 1 >= k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans + k);
    }
}
