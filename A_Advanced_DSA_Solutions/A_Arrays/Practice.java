package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice {
    public void findMaxSumSubArray(int arr[]) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max sum of the sub array is : " + maxSum);
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        obj.findMaxSumSubArray(arr);
    }
}
