package Array.BinarySearch;

public class SearchTargetElement {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int start = 0, end = nums.length - 1, mid;
        int target = 0;

        while (start <= end) {
            mid = (start + (end - start) / 2);

            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            } else if (nums[mid] >= nums[0]) {
                if (nums[0] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            } else {
                if (nums[mid] <= target && nums[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
    }
}
