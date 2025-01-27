package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public int linearSearch(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = n - 1, middle;
        while (left <= right) {
            middle = left + (right - left) / 2;

            if (arr[middle] == target) {
                return middle;
            }
            if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 45, 64, 3, 644, 46 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the number that you want to search");
        int target = sc.nextInt();
        // int res = obj.linearSearch(arr, target);
        Arrays.sort(arr);
        int res = obj.binarySearch(arr, target);
        if (res == -1) {
            System.out.println("Given Number is not in the array");
        } else {
            System.out.println("Given Number is at index: " + res);
        }

    }
}
