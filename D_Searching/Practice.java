package D_Searching;

import java.util.Scanner;
import java.util.Arrays;

public class Practice {
    public int linearSearch(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int n, int x) {
        int first = 0, last = n - 1, middle;
        while (first <= last) {
            middle = first + (last - first) / 2;
            if (x == arr[middle]) {
                return middle;
            } else if (x < arr[middle]) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Practice se = new Practice();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3, 5, 6, 7 };
        int x;
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the number that you want to search in the array");
        x = sc.nextInt();
        // int result = se.linearSearch(arr, arr.length, x);
        int result = se.binarySearch(arr, arr.length, x);

        if (result == -1) {
            System.out.println("Element not found in the array");

        } else {
            System.out.println("Element is at index :" + result);
        }
        sc.close();

    }
}
