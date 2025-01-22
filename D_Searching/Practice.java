package D_Searching;

import java.util.Arrays;

public class Practice {
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
        int left = 0, right = arr.length - 1, middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (x == arr[middle]) {
                return middle;
            } else if (x < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice find = new Practice();
        int arr[] = { 3, 46, 6, 7, 5 };
        int x = 5;
        System.out.println("Given Array: " + Arrays.toString(arr));
        // int res = find.linearSearch(arr, x);
        Arrays.sort(arr);
        int res = find.binarySearch(arr, x);
        if (res == -1) {
            System.out.println("Element is not in the array: ");

        } else {
            System.out.println("Element is at index: " + res);
        }
    }
}
