package A_Advanced_DSA_Solutions.A_Arrays;

public class Practice {

    public int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = obj.maxSubArray(arr);
        System.out.println("Max sum of the array is " + result);

    }
}
