package Array.Lecture17;

public class MissingNumber {
    // Find the missing number in the array.
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        System.out.println(sum - arraySum);
    }
}
