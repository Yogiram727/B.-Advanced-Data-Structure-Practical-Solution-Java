package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice3 {
    public int findRotatedSortArray(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = n - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Practice3 obj = new Practice3();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println("Given Array: " + Arrays.toString(nums));
        int res = obj.findRotatedSortArray(nums, 2);
        if (res == -1) {
            System.out.println("Given number is not in the list: ");
        } else {
            System.out.println("Given number is at index: " + res);
        }

    }
}
