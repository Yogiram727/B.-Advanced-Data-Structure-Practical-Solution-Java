package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice2 {
    public int findMaxSUmArray(int arr[]) {

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Practice2 obj = new Practice2();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = obj.findMaxSUmArray(nums);
        System.out.println("Max Sum: " + maxSum);

    }
}
