package Array.BinarySearch;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {4, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        int start = 0, end = arr.length - 1, mid;

        while (start < end) {
            mid = (start + (end - start) / 2);

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        System.out.println(arr[end]);
    }
}
