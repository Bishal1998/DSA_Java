package Array.BinarySearch;

public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};

        int start = 0, end = 0, m = 2, ans = -1;


        if(m > arr.length){
            System.out.println(ans);
        }



        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            int page = 0, count = 1;

            for (int i = 0; i < arr.length; i++) {
                page += arr[i];

                if (page > mid) {
                    count++;
                    page = arr[i];
                }
            }

            if (count <= m) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
