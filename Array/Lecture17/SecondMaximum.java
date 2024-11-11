package Array.Lecture17;

public class SecondMaximum {
    /*
    Find the second maximum value from the given array
    For that find the maximum value and again loop over to check second max with the help of maximum value
     */
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 3, 8, 5, 1};

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        /* The value of max and second_max depends upon question
        like if the question provide the range of the positive value then we can set the max and second_max to -1. And if question is to return -1 if the second_max doesn't exist then in that case as well we can set the initial value to -1.
         */
        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max){
                max= arr[i];
            }
        }


        for (int i = 0; i<arr.length;i++){
            if (arr[i] > second_max && arr[i] < max ){
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
    }
}
