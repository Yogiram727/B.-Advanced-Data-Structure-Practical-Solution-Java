package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Practice4 {
    public int searchRotatedSearch(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = n - 1, middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (target == arr[middle]) {
                return middle;
            }
            if (arr[left] < arr[middle]) {
                if (target >= arr[left] && target < arr[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }

            } else {
                if (target > arr[middle] && target <= arr[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Practice4 search = new Practice4();
        Scanner sc = new Scanner(System.in);
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Given Array: " + Arrays.toString(nums));
        System.out.println("Enter the number to be searched");
        int num = sc.nextInt();
        int res = search.searchRotatedSearch(nums, num);
        if (res == -1) {
            System.out.println("Number is not in the array");
        } else {
            System.out.println("Number is at index: " + res);
        }
        sc.close();

    }
}
