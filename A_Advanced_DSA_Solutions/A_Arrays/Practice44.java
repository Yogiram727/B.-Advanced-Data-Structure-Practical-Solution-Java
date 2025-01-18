package A_Advanced_DSA_Solutions.A_Arrays;

public class Practice44 {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Max sum of the sub array is : " + maxSum);
    }
}
