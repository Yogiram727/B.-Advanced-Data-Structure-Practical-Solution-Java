package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public int searchRotatedArray(int arr[], int target) {
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
        Scanner sc = new Scanner(System.in);
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Given Array: " + Arrays.toString(nums));
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        int res = obj.searchRotatedArray(nums, target);
        if (res == -1) {
            System.out.println("Number is not in the array");
        } else {
            System.out.println("Number is at index: " + res);
        }
        sc.close();
    }
}
