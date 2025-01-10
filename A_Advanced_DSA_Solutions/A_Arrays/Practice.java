package A_Advanced_DSA_Solutions.A_Arrays;

public class Practice {

    public int findMaxSubSum(int arr[]) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int result = obj.findMaxSubSum(arr);
        System.out.println("Maximum sum of the sub array is " + result);
    }

}
