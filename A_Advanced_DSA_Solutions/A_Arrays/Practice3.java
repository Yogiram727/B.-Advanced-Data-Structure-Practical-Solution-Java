package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Sum of the subarray is : " + maxSum);

    }
}
