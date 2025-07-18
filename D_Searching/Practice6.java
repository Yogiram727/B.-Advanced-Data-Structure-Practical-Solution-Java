package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {

    public int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int x) {
        int n = arr.length;
        int first = 0, last = n - 1, mid;
        while (first <= last) {
            mid = first + (last - first) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice6 se = new Practice6();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3, 5, 6, 8, 33 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the value to be searched in the given array: ");
        int value = sc.nextInt();
        // int result = se.linearSearch(arr, value);
        int result = se.binarySearch(arr, value);
        if (result == -1) {
            System.out.println("Value is not in the array: ");
        } else {
            System.out.println("Value is at index:" + result);
        }
    }
}
