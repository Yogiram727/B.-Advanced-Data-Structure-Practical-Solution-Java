package A_Advanced_DSA_Solutions.A_Arrays;

public class F_SearchRotatedSortArray {
    public int search(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = right + (left - right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;

                } else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        F_SearchRotatedSortArray obj = new F_SearchRotatedSortArray();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        int target = 0;
        int result = obj.search(nums, target);
        System.out.println("Index of target: " + target + ": " + result);

        target = 3;
        result = obj.search(nums, target);
        System.out.println("Index of target: " + target + ":" + result);
    }
}
