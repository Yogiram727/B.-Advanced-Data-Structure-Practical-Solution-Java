package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice {
    public void maxSubSum(int arr[]) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max Sum of the Arrays is: " + maxSum);
    }

    public static void main(String args[]) {
        Practice p = new Practice();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Given Array is : " + Arrays.toString(arr));
        p.maxSubSum(arr);
    }
}
