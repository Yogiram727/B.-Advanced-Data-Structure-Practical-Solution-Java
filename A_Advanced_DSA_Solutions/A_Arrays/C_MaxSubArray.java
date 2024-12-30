package A_Advanced_DSA_Solutions.A_Arrays;

public class C_MaxSubArray {

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
        C_MaxSubArray obj = new C_MaxSubArray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int result = obj.maxSubArray(nums);
        System.out.println("The maximum subarray sum is: " + result);
    }
}
